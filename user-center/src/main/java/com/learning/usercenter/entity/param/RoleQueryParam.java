package com.learning.usercenter.entity.param;

import com.learning.usercenter.common.entity.param.BaseParam;
import com.learning.usercenter.entity.po.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zzz
 * @date 2021年8月11日10:09:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RoleQueryParam extends BaseParam<Role> {

    private String code;

    private String name;
}
