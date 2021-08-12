package com.learning.usercenter.entity.form;

import com.learning.usercenter.common.entity.form.BaseForm;
import com.learning.usercenter.entity.po.Role;
import lombok.Data;

import java.util.Set;

/**
 * @author Zzz
 */
@Data
public class RoleUpdateForm extends BaseForm<Role> {

    /**
     * 角色编码
     */
    private String code;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色描述
     */
    private String description;

    /**
     * 角色拥有的资源id列表
     */
    private Set<Long> resourceIds;

}
