package com.learning.usercenter.exception;


import com.learning.usercenter.common.exception.BaseException;

/**
 * @author Zzz
 */
public class RoleNotFoundException extends BaseException {

    private static final long serialVersionUID = -48423797629635069L;

    public RoleNotFoundException() {
        super(OrganizationErrorType.ROLE_NOT_FOUND);
    }

    public RoleNotFoundException(String message) {
        super(OrganizationErrorType.ROLE_NOT_FOUND, message);
    }
}
