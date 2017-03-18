package com.softgroup.common.router.factory.api;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;

/**
 * Created by yuriy on 14.03.17.
 */
public interface HandlerFactory {

    Handler getHandler(Request<?> msg);

}
