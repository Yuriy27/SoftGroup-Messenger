package com.softgroup.authorization.impl;

import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.factory.api.AbstractHandlerFactory;
import com.softgroup.common.factory.api.RequestHandlerFactory;
import com.softgroup.common.factory.impl.RequestHandlerFactoryImpl;
import org.springframework.stereotype.Component;

/**
 * Created by yuriy on 14.03.17.
 */
@Component
public class AuthorizationHandlerFactory
        extends RequestHandlerFactoryImpl<AuthorizationRequestHandler> {
}
