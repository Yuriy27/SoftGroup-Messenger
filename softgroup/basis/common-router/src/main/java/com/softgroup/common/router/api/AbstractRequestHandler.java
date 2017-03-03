package com.softgroup.common.router.api;


import com.softgroup.common.datamapper.DataMapper;
import com.softgroup.common.datamapper.JacksonDataMapper;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.RequestData;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.reflect.ParameterizedType;
import java.util.Map;

public abstract class AbstractRequestHandler<T extends RequestData, R extends ResponseData> implements RequestHandler {

	@Autowired
	DataMapper mapper;

 	public String getName() {
		return "abstract";
	}

	public abstract Response<R> doHandle(Request<T> msg);

	@Override
	public Response<R> handle(Request<?> msg) {
		Request<T> converted = new Request<>();
		converted.setHeader(msg.getHeader());

		Class thisClass = AbstractRequestHandler.class;
		ParameterizedType type = (ParameterizedType) thisClass.getGenericSuperclass();
		Class parameter = (Class) type.getActualTypeArguments()[0];
		converted.setData(mapper.convert((Map<String, Object>) msg.getData(), (Class<T>) parameter));

		return doHandle(converted);
	}

}
