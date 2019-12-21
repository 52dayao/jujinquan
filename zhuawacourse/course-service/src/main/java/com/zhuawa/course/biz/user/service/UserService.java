package com.zhuawa.course.biz.user.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zhuawa.course.dao.user.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author mybatis-plus
 * @since 2019-12-09
 */
public interface UserService extends IService<User> {
    public IPage<User> UserIpageDS(Page page);
}
