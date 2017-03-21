package com.softgroup.common.dao.repository;

import com.softgroup.common.dao.entities.ProfileEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by yuriy on 21.03.17.
 */
public interface ProfileRepository
        extends PagingAndSortingRepository<ProfileEntity, String> {

    //List<ProfileEntity> findAll();



    List<ProfileEntity> findByName(String s);

    List<ProfileEntity> findByNameAndPhoneNumber(String name, String number);

}
