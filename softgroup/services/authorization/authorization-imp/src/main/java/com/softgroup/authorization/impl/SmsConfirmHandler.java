package com.softgroup.authorization.impl;

import com.softgroup.authorization.api.message.SmsConfirmRequest;
import com.softgroup.authorization.api.message.SmsConfirmResponse;
import com.softgroup.authorization.api.router.AuthorizationRequestHandler;
import com.softgroup.common.cache.entity.RegisterInfo;
import com.softgroup.common.cache.service.CacheService;
import com.softgroup.common.dao.entities.ProfileEntity;
import com.softgroup.common.dao.entities.ProfileSettingsEntity;
import com.softgroup.common.dao.service.ProfileService;
import com.softgroup.common.protocol.HttpStatus;
import com.softgroup.common.protocol.Request;
import com.softgroup.common.protocol.Response;
import com.softgroup.common.protocol.ResponseStatus;
import com.softgroup.common.router.api.AbstractRequestHandler;
import com.softgroup.common.token.api.TokenProvider;
import com.softgroup.common.token.api.TokenType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by yuriy27 on 17.04.17.
 */
@Component
public class SmsConfirmHandler
        extends AbstractRequestHandler<SmsConfirmRequest, SmsConfirmResponse>
        implements AuthorizationRequestHandler {

    @Autowired
    private CacheService cacheService;

    @Autowired
    private TokenProvider tokenProvider;

    @Autowired
    private ProfileService profileService;

    @Override
    public String getName() {
        return "sms_confirm";
    }

    @Override
    public Response<SmsConfirmResponse> doHandle(Request<SmsConfirmRequest> msg) {
        SmsConfirmRequest req = msg.getData();
        SmsConfirmResponse resp = new SmsConfirmResponse();
        RegisterInfo info = cacheService.get(req.getRegistrationRequestUuid());
        if (info != null && req.getAuthCode().equals(info.getAuthCode())) {
            String profileId = saveToDb(info).getId();
            resp.setDeviceToken(tokenProvider.generateToken(info.getDeviceId(), profileId, TokenType.DEVICE));
            return responseFactory.build(msg, resp);
        }

        return responseFactory.build(msg, resp, HttpStatus.UNPROCESSABLE_ENTITY);
    }

    private ProfileEntity saveToDb(RegisterInfo info) {
        ProfileEntity profile = new ProfileEntity();
        profile.setName(info.getName());
        profile.setPhoneNumber(info.getPhoneNumber());
        profile.setAvatarUri("none");
        profile.setStatus("created");
        profile.setSettingsEntities(new ProfileSettingsEntity());
        profile.setCreateDateTime(System.currentTimeMillis());
        profile.setUpdateDateTime(System.currentTimeMillis());
        return profileService.save(profile);
    }
}
