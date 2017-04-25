package com.softgroup.common.dao.service;

import com.softgroup.common.dao.api.AbstractCrudService;
import com.softgroup.common.dao.entities.ContactEntity;
import com.softgroup.common.dao.repository.ContactRepository;
import org.springframework.stereotype.Service;

/**
 * Created by yuriy27 on 20.04.17.
 */
@Service
public class ContactService extends AbstractCrudService<ContactEntity, ContactRepository> {

    public ContactEntity findByName(String name) {
        return getRepository().findByName(name);
    }

}
