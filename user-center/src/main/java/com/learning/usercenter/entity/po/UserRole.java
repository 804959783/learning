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
 * @date 2021年8月11日09:39:50
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("user_role_relation")
public class UserRole extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -4381443321786706417L;

    private Long userId;

    private Long roleId;
}
