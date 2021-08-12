package com.learning.usercenter.entity.vo;

import com.learning.usercenter.common.entity.vo.BaseVo;
import com.learning.usercenter.entity.po.User;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.BeanUtils;

import java.util.Date;
import java.util.Set;

/**
 * @author Zzz
 * @date 2021年8月11日10:16:49
 */
@Data
@NoArgsConstructor
public class UserVo extends BaseVo<User> {

    private static final long serialVersionUID = 8307091610190750634L;

    public UserVo(User user) {
        BeanUtils.copyProperties(user, this);
    }

    private String name;

    private String mobile;

    private String username;

    private String description;

    private String deleted;

    private Set<String> roleIds;

    private String createdBy;

    private String updatedBy;

    private Date createdTime;

    private Date updatedTime;
}
