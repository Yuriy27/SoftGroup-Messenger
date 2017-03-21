package com.softgroup.common.dao.api;

import com.softgroup.common.dao.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yuriy on 21.03.17.
 */
public class AbstractCrudService<T, ID extends Serializable, R extends PagingAndSortingRepository<T, ID>> {

    @Autowired
    private R repository;

    public R getRepository() {
        return repository;
    }

    public Iterable<T> findAll() {
        return repository.findAll();
    }

    public T save(T entity) {
        return repository.save(entity);
    }

    public T findOne(ID id) {
        return repository.findOne(id);
    }

    public void delete(T entity) {
        repository.delete(entity);
    }

    public void delete(ID id) {
        repository.delete(id);
    }

}
