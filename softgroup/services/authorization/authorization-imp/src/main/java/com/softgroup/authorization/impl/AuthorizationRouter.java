package com.softgroup.authorization.impl;

import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.common.router.api.CommonRouterHandler;
import org.springframework.stereotype.Component;

/**
 * Created by yuriy on 28.02.17.
 */
@Component
public class AuthorizationRouter
        extends AbstractRouterHandler<AuthorizationHandlerFactory>
        implements CommonRouterHandler {

    public String getName() {
        return "authorization";
    }
}
