package com.softgroup.authorization.impl;

import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.authorization.api.router.AuthorizationRouterHandler;
import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.common.factory.api.RequestHandlerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by yuriy on 28.02.17.
 */
@Component
public class AuthorizationRouter
        extends AbstractRouterHandler<RequestHandlerFactory<AuthorizationRequestHandler>>
        implements AuthorizationRouterHandler {

    public String getName() {
        return "authorization";
    }
}
