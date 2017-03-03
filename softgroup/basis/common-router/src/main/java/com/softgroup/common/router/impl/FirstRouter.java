package com.softgroup.common.router.impl;

import com.softgroup.common.factory.api.RouterHandlerFactory;
import com.softgroup.common.factory.impl.RouterHandlerFactoryImpl;
import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.common.router.api.CommonRouterHandler;
import com.softgroup.common.router.api.RouterHandler;
import org.springframework.stereotype.Component;

/**
 * Created by yuriy on 28.02.17.
 */
@Component
public class FirstRouter
        extends AbstractRouterHandler<RouterHandlerFactory<CommonRouterHandler>>
        implements RouterHandler {

    public String getName() {
        return "first";
    }
}
