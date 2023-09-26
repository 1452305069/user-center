package com.kang.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserLoginRequest implements Serializable {


    private static final long serialVersionUID = -44174977115660121L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;

}
