package com.softgroup.common.dao.tests;

import com.softgroup.common.dao.config.CommonDaoAppCfg;
import com.softgroup.common.dao.entities.ProfileEntity;
import com.softgroup.common.dao.repository.ProfileRepository;
import com.softgroup.common.dao.service.ProfileService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yuriy on 21.03.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CommonDaoAppCfg.class})
public class ProfileServiceTest {

    @Autowired
    ProfileService service;

    @Test
    public void test1() {
        ProfileEntity entity = new ProfileEntity();
        entity.setAvatarUri("uir");
        entity.setCreateDateTime(9990l);
        entity.setName("name");
        entity.setPhoneNumber("phone");
        entity.setStatus("status");
        entity.setUpdateDateTime(90l);
        service.save(entity);
    }

}
