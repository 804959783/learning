package com.learning.usercenter.exception;


import com.learning.usercenter.common.exception.BaseException;

/**
 * @author Zzz
 */
public class UserNotFoundException extends BaseException {

    private static final long serialVersionUID = 7769305413001375040L;

    public UserNotFoundException() {
        super(OrganizationErrorType.USER_NOT_FOUND);
    }

    public UserNotFoundException(String message) {
        super(OrganizationErrorType.USER_NOT_FOUND, message);
    }
}
