package com.softgroup.common.token.impl;

import com.softgroup.common.protocol.RoutedData;
import com.softgroup.common.token.api.TokenProvider;
import com.softgroup.common.token.api.TokenType;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwt;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * Created by yuriy on 29.03.17.
 */
@Component
public class JwtTokenProvider
        implements TokenProvider {

    private static final String SECRET = "1234secret0Auth22";

    private static final Long DEVICE_TOKEN_TIME = 1000l * 3600 * 24 * 365;

    private static final Long SESSION_TOKEN_TIME = 1000l * 3600 * 24;

    @Override
    public String generateToken(String deviceId, String profileId, TokenType type) {
        long expirationTime;
        if (type == TokenType.DEVICE) {
            expirationTime = DEVICE_TOKEN_TIME;
        } else {
            expirationTime = SESSION_TOKEN_TIME;
        }
        return Jwts.builder()
                .signWith(SignatureAlgorithm.HS256, SECRET)
                .claim("device_id", deviceId)
                .claim("profile_id", profileId)
                .claim("token_type", type)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + expirationTime))
                .compact();
    }

    @Override
    public void verifyToken(String token) {
        Claims claims = Jwts.parser()
                .setSigningKey(SECRET)
                .parseClaimsJws(token)
                .getBody();
    }

    @Override
    public String getDeviceId(String token) {
        return (String) getClaims(token).get("device_id");
    }

    @Override
    public String getProfileId(String token) {
        return (String) getClaims(token).get("profile_id");
    }

    @Override
    public TokenType getTokenType(String token) {
        return TokenType.valueOf((String) getClaims(token).get("token_type"));
    }


    @Override
    public Long getExpirationTime(String token) {
        return getClaims(token).getExpiration().getTime();
    }

    @Override
    public RoutedData getRoutedData(String token) throws RuntimeException {
        if (this.getTokenType(token).equals(TokenType.SESSION)) {
            return new RoutedData(this.getProfileId(token), this.getDeviceId(token));
        }
        throw new RuntimeException("Not correct token");
    }

    private Claims getClaims(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET)
                .parseClaimsJws(token)
                .getBody();
    }
}
