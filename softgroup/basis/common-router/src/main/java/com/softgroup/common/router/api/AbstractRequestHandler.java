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

public abstract class AbstractRequestHandler<T extends RequestData, R extends ResponseData>
		implements RequestHandler {

	@Autowired
	DataMapper mapper;

	public abstract Response<R> doHandle(Request<T> msg);

	@Override
	public Response<R> handle(Request<?> msg) {
		Request<T> converted = new Request<>();
		converted.setHeader(msg.getHeader());

		ParameterizedType type = (ParameterizedType) getClass().getGenericSuperclass();
		Class<T> parameter = (Class<T>) type.getActualTypeArguments()[0];
		converted.setData(mapper.convert((Map<String, Object>) msg.getData(), parameter));

		return doHandle(converted);
	}

}
