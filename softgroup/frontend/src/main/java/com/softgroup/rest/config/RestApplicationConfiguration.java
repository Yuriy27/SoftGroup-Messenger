package com.softgroup.rest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * Created by yuriy on 08.03.17.
 */
@Configuration
@ComponentScan(basePackages = "com.softgroup",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Configuration.class)
)
public class RestApplicationConfiguration {
}
