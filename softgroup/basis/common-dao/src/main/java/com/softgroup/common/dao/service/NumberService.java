package com.softgroup.common.dao.service;

import com.softgroup.common.dao.api.AbstractCrudService;
import com.softgroup.common.dao.entities.NumberEntity;
import com.softgroup.common.dao.repository.NumberRepository;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

/**
 * Created by yuriy27 on 25.04.17.
 */
@Service
public class NumberService extends AbstractCrudService<NumberEntity, NumberRepository> {
}
