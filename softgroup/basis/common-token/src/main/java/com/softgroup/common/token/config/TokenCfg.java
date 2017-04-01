package com.softgroup.common.token.config;

import com.softgroup.common.token.api.TokenProvider;
import com.softgroup.common.token.impl.JwtTokenProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by yuriy on 01.04.17.
 */
@Configuration
@ComponentScan(basePackages = "com.softgroup.common.token.impl")
public class TokenCfg {
    @Bean
    public TokenProvider tokenProvider() {
        return new JwtTokenProvider();
    }
}
