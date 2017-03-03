package com.softgroup.common.factory.api;

import com.softgroup.common.router.api.Handler;

/**
 * Created by yuriy on 03.03.17.
 */
public interface RouterHandlerFactory<T extends Handler>
        extends HandlerFactory<T> {
}
