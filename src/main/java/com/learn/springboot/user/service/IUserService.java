package com.learn.springboot.user.service;

import com.learn.springboot.user.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author xiaopeiquan
 * @since 2023-07-27
 */
public interface IUserService extends IService<User> {

    boolean addOne(User user);
}
