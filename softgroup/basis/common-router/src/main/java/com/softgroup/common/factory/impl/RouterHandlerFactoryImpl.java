package com.softgroup.common.factory.impl;

import com.softgroup.common.factory.api.RouterHandlerFactory;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.factory.api.AbstractHandlerFactory;
import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.common.router.api.RouterHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yuriy on 28.02.17.
 */
@Component
public class RouterHandlerFactoryImpl<T extends RouterHandler>
        extends AbstractHandlerFactory<T>
        implements RouterHandlerFactory<T>{

    @Override
    public String getRouteKey(Request<?> msg) {
        return msg.getHeader().getType();
    }

}