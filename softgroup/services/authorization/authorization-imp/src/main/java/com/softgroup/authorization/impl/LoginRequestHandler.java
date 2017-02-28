package com.softgroup.authorization.impl;

import com.softgroup.authorization.api.message.LoginRequest;
import com.softgroup.authorization.api.message.LoginResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by yuriy on 28.02.17.
 */
@Component
public class LoginRequestHandler
        extends AbstractRequestHandler<LoginRequest, LoginResponse>
        implements AuthorizationRequestHandler {

    @Override
    public String getName() {
        return "login";
    }

    public Response<LoginResponse> doHandle(Request<LoginRequest> msg) {
        Response<LoginResponse> resp = new Response<LoginResponse>();
        resp.setHeader(msg.getHeader());
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setToken("some token");
        resp.setData(new LoginResponse());
        return resp;
    }

}
