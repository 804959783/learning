package com.learning.usercenter.entity.param;

import com.learning.usercenter.common.entity.param.BaseParam;
import com.learning.usercenter.entity.po.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zzz
 * @date 2021年8月11日10:09:26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserQueryParam extends BaseParam<User> {

    private String name;

    private String mobile;

    private String username;
}
