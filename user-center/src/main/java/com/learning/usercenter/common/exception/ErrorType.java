package com.learning.usercenter.common.exception;

/**
 * @author Zzz
 * @date 2021/8/11 9:52
 */
public interface ErrorType {
    /**
     * 返回code
     *
     * @return
     */
    String getCode();

    /**
     * 返回mesg
     *
     * @return
     */
    String getMesg();
}
