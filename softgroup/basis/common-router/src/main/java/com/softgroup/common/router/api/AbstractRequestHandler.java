package com.softgroup.common.router.api;


import com.softgroup.common.datamapper.DataMapper;
import com.softgroup.common.datamapper.JacksonDataMapper;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.RequestData;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseData;
import com.softgroup.common.utils.ReflectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.lang.reflect.ParameterizedType;
import java.util.Map;

public abstract class AbstractRequestHandler<T extends RequestData, R extends ResponseData>
		implements RequestHandler {

	@Autowired
	DataMapper mapper;

	private final Class parameter = ReflectionUtils
			.getParamter(AbstractRequestHandler.class);

 	public String getName() {
		return "abstract";
	}

	public abstract Response<R> doHandle(Request<T> msg);

	@Override
	public Response<R> handle(Request<?> msg) {
		Request<T> converted = new Request<>();
		converted.setHeader(msg.getHeader());
		converted.setData(mapper.convert((Map<String, Object>) msg.getData(), (Class<T>) parameter));

		return doHandle(converted);
	}

}
