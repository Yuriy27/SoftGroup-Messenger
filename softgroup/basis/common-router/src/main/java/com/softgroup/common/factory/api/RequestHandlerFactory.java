package com.softgroup.common.factory.api;

import com.softgroup.common.router.api.Handler;

/**
 * Created by yuriy on 14.03.17.
 */
public interface RequestHandlerFactory<T extends Handler>
        extends HandlerFactory<T> {
}
