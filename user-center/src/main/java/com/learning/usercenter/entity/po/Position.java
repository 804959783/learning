package com.learning.usercenter.entity.po;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.learning.usercenter.common.entity.po.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Zzz
 * @date 2021/8/10 17:35
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Position extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -7821934611908439371L;

    private String name;

    private String description;

    @TableLogic(delval = "Y", value = "N")
    private String deleted;
}
