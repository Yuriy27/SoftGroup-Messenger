package com.softgroup.common.router.api;

import com.softgroup.common.router.factory.api.HandlerFactory;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class AbstractRouterHandler<F extends HandlerFactory>
		implements RouterHandler {

	@Autowired
	private F handlerFactory;

	@Override
	public Response<?> handle(Request<?> msg) {
		Handler handler = handlerFactory.getHandler(msg);
		if (handler != null) {
			return handler.handle(msg);
		}
		return null;//TODO: return error{bad request}
	}

}
