package com.softgroup.rest.controller;

import com.softgroup.common.datamapper.DataMapper;
import com.softgroup.common.protocol.FrontRequest;
import com.softgroup.common.protocol.RoutedData;
import com.softgroup.common.router.impl.FirstRouter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Security;

/**
 * Created by yuriy27 on 08.04.17.
 */
@RestController
@RequestMapping(value = "/api/private", method = RequestMethod.POST)
public class PrivateEndpoint {

    @Autowired
    DataMapper dataMapper;

    @Autowired
    FirstRouter firstRouter;

    @RequestMapping(value = "/route", method = RequestMethod.POST)
    public String processRequest(@RequestBody String body) {
        FrontRequest request = dataMapper.mapData(body, FrontRequest.class);
        request.setRoutedData((RoutedData) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
        return dataMapper.objectToString(firstRouter.handle(request));
    }

    @RequestMapping(value = "/test")
    public String test() {
        return "test case";
    }

}
