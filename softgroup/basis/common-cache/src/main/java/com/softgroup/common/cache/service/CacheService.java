package com.softgroup.common.cache.service;

import com.softgroup.common.cache.entity.RegisterInfo;

/**
 * Created by yuriy27 on 04.04.17.
 */
public interface CacheService {

    void put(String key, RegisterInfo info);

    RegisterInfo get(String key);

}
