package com.learning.usercenter.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.learning.usercenter.common.entity.po.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

/**
 * @author Zzz
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("roles")
public class Role extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -8236337403857104486L;

    private String code;

    private String name;

    private String description;

    @TableField(exist = false)
    private Set<Long> resourceIds;
}
