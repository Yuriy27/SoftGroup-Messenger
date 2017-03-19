package com.softgroup.common.router.factory.impl;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.CommonRouterHandler;
import org.springframework.stereotype.Component;

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
