package com.softgroup.common.token.api;

/**
 * Created by yuriy on 29.03.17.
 */
public interface TokenProvider {

    String generateToken(String deviceId, String profileId, TokenType type);

    void verifyToken(String token);

    String getDeviceId(String token);

    String getProfileId(String token);

    TokenType getTokenType(String token);

    Long getExpirationTime(String token);

}
