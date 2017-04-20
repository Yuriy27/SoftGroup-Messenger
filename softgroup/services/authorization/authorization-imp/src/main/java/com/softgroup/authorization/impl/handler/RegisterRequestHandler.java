package com.softgroup.authorization.impl.handler;

import com.softgroup.authorization.api.message.RegisterRequest;
import com.softgroup.authorization.api.message.RegisterResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.cache.entity.RegisterInfo;
import com.softgroup.common.cache.service.CacheService;
import com.softgroup.common.protocol.HttpStatus;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseStatus;
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
        RegisterResponse reg = new RegisterResponse();
        RegisterInfo info = getRegisterInfo(msg.getData());
        if (isNotNullData(info)) {
            String regUuid = UUID.randomUUID().toString();
            reg.setRegistrationRequestUuid(regUuid);
            reg.setRegistrationTimeoutSec(10);
            reg.setAuthCode(info.getAuthCode());
            cacheService.put(regUuid, info);
            return responseFactory.build(msg, reg);
        }

        return responseFactory.build(msg, reg, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    private boolean isNotNullData(RegisterInfo info) {
        return info.getAuthCode() != null
                && info.getDeviceId() != null
                && info.getLocaleCode() != null
                && info.getName() != null
                && info.getPhoneNumber() != null;
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
