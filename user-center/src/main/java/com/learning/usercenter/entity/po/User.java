package com.learning.usercenter.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import com.learning.usercenter.common.entity.po.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Set;

/**
 * 用户
 * @author Zzz
 * @date 2021/8/10 17:35
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("user")
public class User extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 2569420081002077767L;

    private String name;

    private String mobile;

    private String username;

    private String password;

    private String description;

    private Boolean enabled;

    private Boolean accountNonExpired;

    private Boolean credentialsNonExpired;

    private Boolean accountNonLocked;

    /**
     * 在字段上加上@TableLogic注解再执行BaseMapper的删除方法时，删除方法会变成修改
     */
    @TableLogic(delval = "Y", value = "N")
    private String deleted;

    @TableField(exist = false)
    private Set<Long> roleIds;

}
