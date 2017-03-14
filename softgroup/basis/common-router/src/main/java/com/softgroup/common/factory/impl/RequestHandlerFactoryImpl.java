package com.softgroup.common.factory.impl;

import com.softgroup.common.factory.api.RequestHandlerFactory;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.factory.api.AbstractHandlerFactory;
import com.softgroup.common.router.api.RequestHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by yuriy on 28.02.17.
 */
@Component
public class RequestHandlerFactoryImpl<T extends RequestHandler>
        extends AbstractHandlerFactory<T>
        implements RequestHandlerFactory<T>{

    @Override
    public String getRouteKey(Request<?> msg) {
        return msg.getHeader().getCommand();
    }
}
