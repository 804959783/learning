package com.learning.usercenter.entity.form;

import com.learning.usercenter.common.entity.form.BaseForm;
import com.learning.usercenter.entity.po.Menu;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author Zzz
 */
@Data
public class MenuForm extends BaseForm<Menu> {

    /**
     * 菜单父id
     */
    @NotBlank(message = "菜单父id不能为空")
    private Long parentId;

    /**
     * 菜单名称
     */
    @NotBlank(message = "菜单名称不能为空")
    private String name;

    /**
     * 菜单类型
     */
    @NotBlank(message = "菜单类型不能为空")
    private String type;

    /**
     * 菜单路径
     */
    @NotBlank(message = "菜单路径不能为空")
    private String href;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 菜单序号
     */
    private String orderNum;

    /**
     * 菜单描述
     */
    private String description;
}
