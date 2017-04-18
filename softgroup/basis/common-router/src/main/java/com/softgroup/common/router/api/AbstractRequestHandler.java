package com.softgroup.common.router.api;


import com.softgroup.common.datamapper.DataMapper;
import com.softgroup.common.datamapper.JacksonDataMapper;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.RequestData;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseData;
import com.softgroup.common.router.factory.impl.ResponseFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.lang.reflect.ParameterizedType;
import java.util.Map;

public abstract class AbstractRequestHandler<T extends RequestData, R extends ResponseData>
		implements RequestHandler {

	@Autowired
	protected ResponseFactory<T, R> responseFactory;

	private final Class<T> parameter = (Class<T>)((ParameterizedType) getClass()
			.getGenericSuperclass())
			.getActualTypeArguments()[0];

	@Autowired
	DataMapper mapper;

	public abstract Response<R> doHandle(Request<T> msg);

	@Override
	public Response<R> handle(Request<?> msg) {
		Request<T> converted = new Request<>();
		converted.setHeader(msg.getHeader());
		converted.setData(mapper.convert((Map<String, Object>) msg.getData(), parameter));

		return doHandle(converted);
	}

}
