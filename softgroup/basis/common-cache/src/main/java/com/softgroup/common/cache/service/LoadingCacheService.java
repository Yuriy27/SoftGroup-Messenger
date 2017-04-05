package com.softgroup.common.cache.service;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.softgroup.common.cache.entity.RegisterInfo;
import org.springframework.stereotype.Component;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * Created by yuriy27 on 04.04.17.
 */
@Component
public class LoadingCacheService
        implements CacheService {

    private static final Long MAXIMUM_CACHE_SIZE = 1000l;
    private static final Long EXPIRE = 1l;

    private static LoadingCache<String, RegisterInfo> cache = CacheBuilder
            .newBuilder()
            .maximumSize(MAXIMUM_CACHE_SIZE)
            .expireAfterWrite(EXPIRE, TimeUnit.MINUTES)
            .build(new CacheLoader<String, RegisterInfo>() {
                @Override
                public RegisterInfo load(String s) throws Exception {
                    return new RegisterInfo();
                }
            });

    @Override
    public void put(String key, RegisterInfo info) {
        cache.put(key, info);
    }

    @Override
    public RegisterInfo get(String key) {
        try {
            return cache.get(key);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }
}
