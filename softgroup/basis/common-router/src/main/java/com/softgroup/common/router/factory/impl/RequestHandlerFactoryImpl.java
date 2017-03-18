package com.softgroup.common.router.factory.impl;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.factory.api.AbstractHandlerFactory;
import com.softgroup.common.router.api.RequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by yuriy on 28.02.17.
 */
@Component
public class RequestHandlerFactoryImpl<T extends RequestHandler>
        extends AbstractHandlerFactory<T> {

    @Override
    public String getRouteKey(Request<?> msg) {
        return msg.getHeader().getCommand();
    }
}
