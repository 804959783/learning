package com.learning.usercenter.entity.form;

import com.learning.usercenter.common.entity.form.BaseForm;
import com.learning.usercenter.entity.po.User;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.util.Set;

/**
 * @author Zzz
 */
@Data
public class UserForm extends BaseForm<User> {

    /**
     * 用户名
     */
    @NotBlank(message = "用户名不能为空")
    @Length(min = 3, max = 20, message = "用户名长度在3到20个字符")
    private String username;

    @NotBlank(message = "用户密码不能为空")
    @Length(min = 5, max = 20, message = "密码长度在5到20个字符")
    private String password;

    @NotBlank(message = "用户手机号不能为空")
    private String mobile;

    @NotBlank(message = "用户姓名不能为空")
    private String name;

    /**
     * 用户描述
     */
    private String description;

    /**
     * 用户拥有的角色id列表
     */
    private Set<Long> roleIds;

    /**
     * 用户状态
     */
    private Boolean enabled = true;

    /**
     * 用户账号是否过期 true为未过期
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
