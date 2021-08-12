package com.learning.usercenter.entity.form;

import com.learning.usercenter.common.entity.form.BaseQueryForm;
import com.learning.usercenter.entity.param.ResourceQueryParam;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import java.util.Date;

/**
 * @author Zzz
 */
@Data
public class PositionQueryForm extends BaseQueryForm<ResourceQueryParam> {

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
     * 查询开始时间
     */
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Past(message = "查询开始时间必须小于当前日期")
    private Date createdTimeStart;

    /**
     * 查询结束时间
     */
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Past(message = "查询结束时间必须小于当前日期")
    private Date createdTimeEnd;
}
