package com.softgroup.common.factory.impl;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;
import com.softgroup.common.factory.api.AbstractHandlerFactory;
import com.softgroup.common.factory.api.RequestHandlerFactory;

/**
 * Created by yuriy on 28.02.17.
 */
public class RequestHandlerFactoryImpl<T extends Handler>
        extends AbstractHandlerFactory<T>
        implements RequestHandlerFactory<T> {
    @Override
    public String getRouteKey(Request<?> msg) {
        return msg.getHeader().getCommand();
    }
}
