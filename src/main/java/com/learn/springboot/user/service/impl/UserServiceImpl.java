package com.learn.springboot.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.learn.springboot.user.entity.User;
import com.learn.springboot.user.mapper.UserMapper;
import com.learn.springboot.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author xiaopeiquan
 * @since 2023-07-27
 */
@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public boolean addOne(User user) {
        save(user);
        mysave(user);
        mysave2(user);
        LambdaQueryWrapper<User> w = Wrappers.lambdaQuery(User.class).eq(User::getName, "xyd");
        System.out.println("查出来了" + list(w));
        return true;
    }

    @Transactional(rollbackFor = Exception.class)
    public void mysave(User user) {
        user.setAge(19);
        save(user);
        LambdaQueryWrapper<User> w = Wrappers.lambdaQuery(User.class).eq(User::getName, "xyd");
        System.out.println("子方法1查出来了" + list(w));
    }
    public void mysave2(User user) {
        user.setAge(20);
        save(user);
        int a = 1 / 0;
        LambdaQueryWrapper<User> w = Wrappers.lambdaQuery(User.class).eq(User::getName, "xyd");
        System.out.println("子方法2查出来了" + list(w));
    }
}
