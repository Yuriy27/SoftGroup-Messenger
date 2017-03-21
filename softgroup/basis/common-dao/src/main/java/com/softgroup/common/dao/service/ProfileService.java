package com.softgroup.common.dao.service;

import com.softgroup.common.dao.api.AbstractCrudService;
import com.softgroup.common.dao.api.CrudService;
import com.softgroup.common.dao.entities.ProfileEntity;
import com.softgroup.common.dao.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yuriy on 21.03.17.
 */
@Service
public class ProfileService
        extends CrudService<ProfileEntity, ProfileRepository> {

}
