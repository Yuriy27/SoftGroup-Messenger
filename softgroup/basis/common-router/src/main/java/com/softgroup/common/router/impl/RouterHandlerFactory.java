package com.softgroup.common.router.impl;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;
import com.softgroup.common.router.api.HandlerFactory;

/**
 * Created by yuriy on 28.02.17.
 */
public class RouterHandlerFactory<T extends Handler> extends HandlerFactory<T> {

    public String getRouteKey(Request<?> msg) {
        return msg.getHeader().getType();
    }

}
