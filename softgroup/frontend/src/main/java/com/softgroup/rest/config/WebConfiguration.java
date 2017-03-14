package com.softgroup.rest.config;

import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by yuriy on 08.03.17.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.softgroup.rest.controller"},
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Configuration.class)
)
public class WebConfiguration {
}
