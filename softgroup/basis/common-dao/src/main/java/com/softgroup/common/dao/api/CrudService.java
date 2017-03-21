package com.softgroup.common.dao.api;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by yuriy on 21.03.17.
 */
public class CrudService<T, R extends PagingAndSortingRepository<T, String>>
        extends AbstractCrudService<T, String, R> {
}
