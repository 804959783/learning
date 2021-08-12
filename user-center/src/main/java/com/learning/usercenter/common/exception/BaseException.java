package com.learning.usercenter.common.exception;

import lombok.Getter;

/**
 * @author Zzz
 * @date 2021/8/11 9:56
 */
@Getter
public class BaseException extends RuntimeException {

    private static final long serialVersionUID = -7712012536513824182L;
    /**
     * 异常对应的错误类型
     */
    private final ErrorType errorType;

    /**
     * 默认是系统异常
     */
    public BaseException() {
        this.errorType = SystemErrorType.SYSTEM_ERROR;
    }

    public BaseException(ErrorType errorType) {
        this.errorType = errorType;
    }

    public BaseException(ErrorType errorType, String message) {
        super(message);
        this.errorType = errorType;
    }

    public BaseException(ErrorType errorType, String message, Throwable cause) {
        super(message, cause);
        this.errorType = errorType;
    }
}
