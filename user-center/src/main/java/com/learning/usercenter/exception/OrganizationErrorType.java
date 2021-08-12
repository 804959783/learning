package com.learning.usercenter.exception;

import com.learning.usercenter.common.exception.ErrorType;
import lombok.Getter;

/**
 * @author Zzz
 */
@Getter
public enum OrganizationErrorType implements ErrorType {

    /**
     * 用户未找到
     */
    USER_NOT_FOUND("030100", "用户未找到！"),

    /**
     * 角色未找到
     */
    ROLE_NOT_FOUND("030200", "角色未找到！");

    /**
     * 错误类型码
     */
    private String code;
    /**
     * 错误类型描述信息
     */
    private String mesg;

    OrganizationErrorType(String code, String mesg) {
        this.code = code;
        this.mesg = mesg;
    }
}
