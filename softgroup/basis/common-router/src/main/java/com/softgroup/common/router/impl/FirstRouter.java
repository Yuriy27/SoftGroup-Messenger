package com.softgroup.common.router.impl;

import com.softgroup.common.factory.api.RouterHandlerFactory;
import com.softgroup.common.factory.impl.FirstHandlerFactory;
import com.softgroup.common.factory.impl.RouterHandlerFactoryImpl;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.common.router.api.CommonRouterHandler;
import com.softgroup.common.router.api.RouterHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yuriy on 28.02.17.
 */
@Component
public class FirstRouter
        extends AbstractRouterHandler<FirstHandlerFactory>
        implements RouterHandler {

    public String getName() {
        return "first";
    }

}
