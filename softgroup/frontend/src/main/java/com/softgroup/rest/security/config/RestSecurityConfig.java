package com.softgroup.rest.security.config;

import com.softgroup.rest.security.TokenFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * Created by yuriy27 on 08.04.17.
 */
@Configuration
@EnableWebSecurity
@ComponentScan("com.softgroup.rest.security")
public class RestSecurityConfig
        extends WebSecurityConfigurerAdapter {

    @Autowired
    private TokenFilter tokenFilter;

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/api/public/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests().anyRequest().authenticated();
        http.addFilterBefore(tokenFilter, UsernamePasswordAuthenticationFilter.class);
    }

}
