package com.softgroup.rest.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by yuriy on 08.03.17.
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    @Override
    public Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RestApplicationConfiguration.class};
    }

    @Override
    public Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfiguration.class};
    }
}
