package com.zhuawa.course.biz.user.service;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhuawa.course.dao.user.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.testng.Assert.*;

/**
 * @Author: jujinquan
 * @Date: 2019/12/9 16:27
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void testDS() {
        int currentPage = 1;
        int pageSize = 20;
        Page page = new Page(currentPage, pageSize);
        IPage<User> userIPage = userService.UserIpageDS(page);
        System.out.println(userIPage.getSize());
    }

}