package com.softgroup.common.router.api;


import com.softgroup.common.datamapper.DataMapper;
import com.softgroup.common.datamapper.JacksonDataMapper;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.RequestData;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseData;

import java.util.Map;

public abstract class AbstractRequestHandler<T extends RequestData, R extends ResponseData> implements RequestHandler {
	@Override
	public String getName() {
		return null;
	}

	abstract Response<R> doHandle(Request<T> msg);

	@Override
	public Response<R> handle(Request<?> msg) {
		DataMapper mapper = new JacksonDataMapper();
		Map<String, Object> map = mapper.convertToMap(msg);
		RequestData data = mapper.convert(map, RequestData.class);
		Request<T> converted = new Request<>();
		converted.setHeader(msg.getHeader());
		converted.setData((T) data);
		return doHandle(converted);
	}

}
