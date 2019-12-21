package com.zhuawa.course.dao.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * @Author: jujinquan
 * @Date: 2019/12/9 15:01
 */
@Configuration
public class DatasourceProperties {

    @Configuration
    @Profile("dev")
    @PropertySource("classpath:application-dev.yml")
    static class Dev {
    }

    @Configuration
    @Profile("pre")
    @PropertySource("classpath:datasource-pre.properties")
    static class Pre {
    }

    @Configuration
    @Profile("pro")
    @PropertySource("classpath:datasource-pro.properties")
    static class Product {
    }

}
