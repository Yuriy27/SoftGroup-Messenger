package com.softgroup.rest.controller;

import com.softgroup.authorization.impl.AuthorizationRouter;
import com.softgroup.common.datamapper.DataMapper;
import com.softgroup.common.datamapper.JacksonDataMapper;
import com.softgroup.common.protocol.FrontRequest;
import com.softgroup.common.router.impl.FirstRouter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yuriy on 08.03.17.
 */
@RestController
@RequestMapping(value = "/api/public")
public class PublicEndpoint {

    @Autowired
    DataMapper dataMapper;

    @Autowired
    FirstRouter firstRouter;

    @RequestMapping(value = "/route", method = RequestMethod.POST)
    public String processRequest(@RequestBody String body) {
        FrontRequest request = dataMapper.mapData(body, FrontRequest.class);
        return dataMapper.objectToString(firstRouter.handle(request));
    }

    @RequestMapping(value = "/test")
    public String test() {
        return "test case";
    }

}
