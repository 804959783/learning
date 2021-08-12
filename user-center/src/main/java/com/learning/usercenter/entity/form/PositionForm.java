package com.learning.usercenter.entity.form;

import com.learning.usercenter.common.entity.form.BaseForm;
import com.learning.usercenter.entity.po.Position;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author Zzz
 */
@Data
public class PositionForm extends BaseForm<Position> {

    /**
     * 职位名称
     */
    @NotBlank(message = "职位名称不能为空")
    private String name;

    /**
     * 职位描述
     */
    private String description;
}
