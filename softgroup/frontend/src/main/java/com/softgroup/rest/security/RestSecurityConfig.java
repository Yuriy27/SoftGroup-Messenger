package com.softgroup.rest.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

/**
 * Created by yuriy27 on 08.04.17.
 */
public class RestSecurityConfig
        extends WebSecurityConfigurerAdapter {

    @Autowired
    private TokenFilter filter;

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/api/public/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests().anyRequest().authenticated();
        http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
    }
}
