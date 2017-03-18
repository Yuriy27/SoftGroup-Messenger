package com.softgroup.authorization.impl;

import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.router.factory.impl.RequestHandlerFactoryImpl;
import org.springframework.stereotype.Component;

/**
 * Created by yuriy on 14.03.17.
 */
@Component
public class AuthorizationHandlerFactoryImpl
        extends RequestHandlerFactoryImpl<AuthorizationRequestHandler>
        implements AuthorizationHandlerFactory {
}
