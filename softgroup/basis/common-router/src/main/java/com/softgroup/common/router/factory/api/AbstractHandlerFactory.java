package com.softgroup.common.router.factory.api;

import com.softgroup.common.protocol.Request;
import com.softgroup.common.router.api.Handler;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by yuriy on 25.02.17.
 */
public abstract class AbstractHandlerFactory<T extends Handler> implements HandlerFactory {

    @Autowired
    private List<T> handlers;

    private Map<String, T> handlerMap = new HashMap<>();

    @PostConstruct
    public void init() {
        for (T handler : handlers) {
            handlerMap.put(handler.getName(), handler);
        }
    }

    public abstract String getRouteKey(Request<?> msg);

    public Handler getHandler(Request<?> msg) {
        return handlerMap.get(getRouteKey(msg));
    }

}
