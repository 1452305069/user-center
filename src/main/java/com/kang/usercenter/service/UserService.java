package com.kang.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kang.usercenter.model.domain.User;

import javax.servlet.http.HttpServletRequest;

/**
* @author sakuul
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2023-09-24 16:49:05
*/
public interface UserService extends IService<User> {
    /**
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @return 用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword,String planetCode);

    /**
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     */

    User getSafetyUser(User originUser);

    /**
     * 用户注销
     */
    int userLogout(HttpServletRequest request);

}
