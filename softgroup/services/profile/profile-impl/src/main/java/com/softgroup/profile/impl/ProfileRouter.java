package com.softgroup.profile.impl;

import com.softgroup.common.router.api.AbstractRouterHandler;
import com.softgroup.common.router.api.CommonRouterHandler;
import org.springframework.stereotype.Component;

/**
 * Created by yuriy27 on 20.04.17.
 */
@Component
public class ProfileRouter
        extends AbstractRouterHandler<ProfileHandlerFactory>
        implements CommonRouterHandler {
    @Override
    public String getName() {
        return "profile";
    }
}
