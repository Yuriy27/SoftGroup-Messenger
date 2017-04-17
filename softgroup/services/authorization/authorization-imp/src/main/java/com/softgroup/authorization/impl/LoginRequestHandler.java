package com.softgroup.authorization.impl;

import com.softgroup.authorization.api.message.LoginRequest;
import com.softgroup.authorization.api.message.LoginResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseStatus;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.common.token.api.TokenProvider;
import com.softgroup.common.token.api.TokenType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yuriy on 28.02.17.
 */
@Component
public class LoginRequestHandler
        extends AbstractRequestHandler<LoginRequest, LoginResponse>
        implements AuthorizationRequestHandler {

    @Autowired
    private TokenProvider tokenProvider;

    public String getName() {
        return "login";
    }

    public Response<LoginResponse> doHandle(Request<LoginRequest> msg) {
        Response<LoginResponse> response = new Response<>();
        response.setHeader(msg.getHeader());

        ResponseStatus status = new ResponseStatus();

        LoginResponse resp = new LoginResponse();

        String deviceToken = msg.getData().getDeviceToken();
        if (tokenProvider.getTokenType(deviceToken).equals(TokenType.DEVICE)) {
            resp.setToken(getSessionTokenFromDevice(deviceToken));
            status.setCode(200);
            status.setMessage("OK");
        } else {
            status.setCode(422);
            status.setMessage("Not valid data in request");
        }

        response.setData(resp);
        response.setStatus(status);

        return response;
    }

    private String getSessionTokenFromDevice(String deviceToken) {
        String deviceId = tokenProvider.getDeviceId(deviceToken);
        String profileId = tokenProvider.getProfileId(deviceToken);
        return tokenProvider.generateToken(deviceId, profileId, TokenType.SESSION);
    }

}
