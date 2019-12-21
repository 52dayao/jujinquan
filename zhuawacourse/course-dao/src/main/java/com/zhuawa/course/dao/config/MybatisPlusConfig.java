package com.zhuawa.course.dao.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @Author: jujinquan
 * @Date: 2019/12/9 14:55
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.zhuawa.course.dao*")
public class MybatisPlusConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
        //设置请求的页面大于最大页操作，true调回到首页，false继续请求，默认false
        //paginationInterceptor.setOverflow(false);
        //设置最大单页限制数量，默认500条，-1不受限制
        //paginationInterceptor.setLimit(500);
        return paginationInterceptor;
    }
}
