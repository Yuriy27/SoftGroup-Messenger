package com.softgroup.common.factory.impl;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;
import com.softgroup.common.factory.api.AbstractHandlerFactory;
import com.softgroup.common.factory.api.RouterHandlerFactory;

/**
 * Created by yuriy on 28.02.17.
 */
public class RouterHandlerFactoryImpl<T extends Handler>
        extends AbstractHandlerFactory<T>
        implements RouterHandlerFactory<T> {

    public String getRouteKey(Request<?> msg) {
        return msg.getHeader().getType();
    }

}