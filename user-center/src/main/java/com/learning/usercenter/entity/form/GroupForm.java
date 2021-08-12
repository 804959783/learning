package com.learning.usercenter.entity.form;

import com.learning.usercenter.common.entity.form.BaseForm;
import com.learning.usercenter.entity.po.Group;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author Zzz
 */
@Data
public class GroupForm extends BaseForm<Group> {

    /**
     * 用户组父id
     */
    @NotBlank(message = "用户组父id不能为空")
    private Long parentId;

    /**
     * 用户组名称
     */
    @NotBlank(message = "用户组名称不能为空")
    private String name;

    /**
     * 用户组描述
     */
    private String description;
}
