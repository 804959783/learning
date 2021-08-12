package com.learning.usercenter.entity.form;

import com.learning.usercenter.common.entity.form.BaseForm;
import com.learning.usercenter.entity.po.Resource;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author Zzz
 */
@Data
public class ResourceForm extends BaseForm<Resource> {

    /**
     * 资源名称
     */
    @NotBlank(message = "资源名称不能为空")
    private String name;

    /**
     * 资源编码
     */
    @NotBlank(message = "资源编码不能为空")
    private String code;

    /**
     * 资源类型
     */
    @NotBlank(message = "资源类型不能为空")
    private String type;

    /**
     * 资源路径
     */
    @NotBlank(message = "资源路径不能为空")
    private String url;

    /**
     * 资源方法
     */
    @NotBlank(message = "资源方法不能为空")
    private String method;

    /**
     * 资源描述
     */
    private String description;
}
