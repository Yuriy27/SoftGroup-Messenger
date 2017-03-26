package com.softgroup.common.dao.repository;

import com.softgroup.common.dao.api.CommonBaseRepository;
import com.softgroup.common.dao.entities.ProfileEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by yuriy on 21.03.17.
 */
public interface ProfileRepository
        extends CommonBaseRepository<ProfileEntity> {

    List<ProfileEntity> findByName(String s);

    List<ProfileEntity> findByNameAndPhoneNumber(String name, String number);

}
