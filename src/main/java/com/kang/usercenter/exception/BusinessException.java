package com.kang.usercenter.exception;

import com.kang.usercenter.common.ErrorCode;

public class BusinessException extends RuntimeException{
    private String description;
    private int code;

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }

    public BusinessException(String message,int code, String description) {
        super(message);
        this.description = description;
        this.code = code;
    }
    public BusinessException(ErrorCode errorCode){
        super(errorCode.getMessage());
        this.code=errorCode.getCode();
        this.description=errorCode.getDescription();
    }
    public BusinessException(ErrorCode errorCode,String description) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
        this.description = description;
    }
}
