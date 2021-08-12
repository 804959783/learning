package com.learning.usercenter.entity.form;

import com.learning.usercenter.common.entity.form.BaseForm;
import com.learning.usercenter.entity.po.User;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.util.Set;

/**
 * @author Zzz
 */
@Data
public class UserUpdateForm extends BaseForm<User> {

    @Length(min = 3, max = 20, message = "用户名长度在3到20个字符")
    private String username;

    @Length(min = 5, max = 20, message = "密码长度在5到20个字符")
    private String password;

    private String mobile;

    private String name;

    private String description;

    private Set<Long> roleIds;

    /**
     * 用户状态，true为可用
     */
    private Boolean enabled = true;

    /**
     * 用户账号是否过期，true为未过期
     */
    private Boolean accountNonExpired = true;

    /**
     * 用户密码是否过期，true为未过期
     */
    private Boolean credentialsNonExpired = true;

    /**
     * 用户账号是否被锁定，true为未锁定
     */
    private Boolean accountNonLocked = true;
}
