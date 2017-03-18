package com.softgroup.rest.config;

import com.softgroup.authorization.impl.config.AuthorizationImplCfg;
import com.softgroup.common.datamapper.configuration.DataMapperAppCfg;
import com.softgroup.common.router.config.CommonRouterCfg;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;

/**
 * Created by yuriy on 08.03.17.
 */
@Configuration
@ComponentScan(basePackages = "com.softgroup.rest",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, value = Configuration.class)
)
@Import(value = {
        DataMapperAppCfg.class,
        CommonRouterCfg.class,
        AuthorizationImplCfg.class
})
public class RestApplicationConfiguration {
}
