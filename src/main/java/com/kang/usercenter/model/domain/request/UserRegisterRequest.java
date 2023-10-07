package com.kang.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;
import java.security.SecureRandom;

/**
 * 用户注册请求体
 * @author kang
 */
@Data
public class UserRegisterRequest implements Serializable {


    private static final long serialVersionUID = -44174977115660121L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

    private String planetCode;

}
