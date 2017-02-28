package com.softgroup.authorization.impl;

import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.authorization.api.router.AuthorizationRouterHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.common.router.api.Handler;
import com.softgroup.common.router.api.HandlerFactory;
import com.softgroup.common.router.impl.RequestHandlerFactory;
import com.softgroup.common.router.impl.RouterHandlerFactory;
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
