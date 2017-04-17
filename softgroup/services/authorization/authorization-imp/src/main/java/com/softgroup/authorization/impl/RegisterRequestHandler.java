package com.softgroup.authorization.impl;

import com.softgroup.authorization.api.message.RegisterRequest;
import com.softgroup.authorization.api.message.RegisterResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.cache.entity.RegisterInfo;
import com.softgroup.common.cache.service.CacheService;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.router.api.AbstractRequestHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by yuriy on 15.03.17.
 */
@Component
public class RegisterRequestHandler
        extends AbstractRequestHandler<RegisterRequest, RegisterResponse>
        implements AuthorizationRequestHandler {

    @Autowired
    private CacheService cacheService;

    @Override
    public String getName() {
        return "register";
    }

    @Override
    public Response<RegisterResponse> doHandle(Request<RegisterRequest> msg) {
        Response<RegisterResponse> response = new Response<>();
        response.setHeader(msg.getHeader());

        String regUuid = UUID.randomUUID().toString();
        RegisterInfo info = getRegisterInfo(msg.getData());

        RegisterResponse reg = new RegisterResponse();
        reg.setRegistrationRequestUuid(regUuid);
        reg.setRegistrationTimeoutSec(10);
        reg.setAuthCode(info.getAuthCode());

        response.setData(reg);

        cacheService.put(regUuid, info);

        return response;
    }

    private RegisterInfo getRegisterInfo(RegisterRequest req) {
        RegisterInfo info = new RegisterInfo();
        info.setAuthCode(UUID.randomUUID().toString());
        info.setPhoneNumber(req.getPhoneNumber());
        info.setName(req.getName());
        info.setDeviceId(req.getDeviceId());
        info.setLocaleCode(req.getLocaleCode());

        return info;
    }
}
