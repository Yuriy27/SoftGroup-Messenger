package com.softgroup.common.router.factory.impl;

import com.softgroup.common.protocol.*;
import org.springframework.stereotype.Component;

/**
 * Created by yuriy27 on 18.04.17.
 */
@Component
public class ResponseFactory<T extends RequestData, R extends ResponseData> {

    public Response<R> build(Request<T> request, R data) {
        Response<R> response = new Response<>();
        response.setHeader(request.getHeader());
        response.setData(data);
        response.setStatus(new ResponseStatus(HttpStatus.SUCCESS.getCode(), HttpStatus.SUCCESS.getMessage()));

        return response;
    }

    public Response<R> build(Request<T> request, R data, HttpStatus status) {
        Response<R> response = build(request, data);
        response.setStatus(new ResponseStatus(status.getCode(), status.getMessage()));
        return response;
    }

}
