package com.softgroup.common.dao.api;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by yuriy on 23.03.17.
 */
public interface CommonBaseRepository<T>
        extends PagingAndSortingRepository<T, String> {
}
