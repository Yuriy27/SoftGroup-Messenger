package com.softgroup.authorization.impl;

import com.softgroup.authorization.api.message.RegisterRequest;
import com.softgroup.authorization.api.message.RegisterResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import org.springframework.stereotype.Component;

/**
 * Created by yuriy on 15.03.17.
 */
@Component
public class RegisterRequestHandler
        extends AbstractRequestHandler<RegisterRequest, RegisterResponse>
        implements AuthorizationRequestHandler {

    @Override
    public String getName() {
        return "register";
    }

    @Override
    public Response<RegisterResponse> doHandle(Request<RegisterRequest> msg) {
        Response<RegisterResponse> response = new Response<>();
        response.setHeader(msg.getHeader());
        RegisterResponse reg = new RegisterResponse();
        reg.setRegistrationRequestUuid("some_registration_request_uuid");
        reg.setRegistrationTimeoutSec(12);
        response.setData(reg);

        return response;
    }
}
