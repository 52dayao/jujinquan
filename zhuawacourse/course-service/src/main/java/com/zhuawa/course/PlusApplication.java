package com.zhuawa.course;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.zhuawa.course.dao.user.dao.UserMapper;
import com.zhuawa.course.dao.user.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.annotation.Resource;

/**
 * @Author: jujinquan
 * @Date: 2019/12/9 15:29
 */
@Slf4j
@SpringBootApplication()
public class PlusApplication {
    @Resource
    private UserMapper userMapper;

    public static void main(String[] args) {
        SpringApplication.run(PlusApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            log.info("start to select user");

            System.out.println(userMapper.selectOne(Wrappers.<User>lambdaQuery().eq(User::getAge, 28)));
            System.out.println(userMapper
                    .selectList(Wrappers.<User>lambdaQuery().ge(User::getAge, 2).eq(User::getName, "Jack")));
            System.out.println(userMapper.selectById(1));
            System.out.println(userMapper.selectCount(null));

        };
    }
}
