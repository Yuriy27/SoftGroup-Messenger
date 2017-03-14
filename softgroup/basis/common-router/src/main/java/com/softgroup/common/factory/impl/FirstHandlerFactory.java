package com.softgroup.common.factory.impl;

import com.softgroup.common.factory.api.AbstractHandlerFactory;
import com.softgroup.common.factory.api.RouterHandlerFactory;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.common.router.api.CommonRouterHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yuriy on 10.03.17.
 */
@Component
public class FirstHandlerFactory
        extends RouterHandlerFactoryImpl<CommonRouterHandler> {

    @Override
    public String getRouteKey(Request<?> msg) {
        return msg.getHeader().getType();
    }
}
