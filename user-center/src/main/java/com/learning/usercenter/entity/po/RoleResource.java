package com.learning.usercenter.entity.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.learning.usercenter.common.entity.po.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Zzz
 * @date 2021年8月11日09:39:24
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("role_resource_relation")
public class RoleResource extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1653072469086176540L;

    private Long roleId;

    private Long resourceId;
}
