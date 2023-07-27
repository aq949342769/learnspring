package com.learn.springboot.user.controller;


import com.learn.springboot.user.entity.User;
import com.learn.springboot.user.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author xiaopeiquan
 * @since 2023-07-27
 */
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {
    @Autowired
    private IUserService iUserService;
    @PostMapping("/addone")
    public boolean addOne(@RequestBody User user) {
        return iUserService.addOne(user);
    }
}
