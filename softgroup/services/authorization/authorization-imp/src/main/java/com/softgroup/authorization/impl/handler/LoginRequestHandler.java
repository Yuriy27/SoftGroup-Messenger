package com.softgroup.authorization.impl.handler;

import com.softgroup.authorization.api.message.LoginRequest;
import com.softgroup.authorization.api.message.LoginResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.protocol.HttpStatus;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseStatus;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.common.token.api.TokenProvider;
import com.softgroup.common.token.api.TokenType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.SignatureException;

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
        LoginResponse resp = new LoginResponse();
        String deviceToken = msg.getData().getDeviceToken();
        try {
            if (tokenProvider.getTokenType(deviceToken).equals(TokenType.DEVICE)) {
                resp.setToken(getSessionTokenFromDevice(deviceToken));
                return responseFactory.build(msg, resp);
            }
        } catch (Exception ex) {
            return responseFactory.build(msg, resp, HttpStatus.UNPROCESSABLE_ENTITY);
        }

        return responseFactory.build(msg, resp, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    private String getSessionTokenFromDevice(String deviceToken) {
        String deviceId = tokenProvider.getDeviceId(deviceToken);
        String profileId = tokenProvider.getProfileId(deviceToken);
        return tokenProvider.generateToken(deviceId, profileId, TokenType.SESSION);
    }

}
