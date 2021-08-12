package com.learning.usercenter.entity.form;

import com.learning.usercenter.common.entity.form.BaseQueryForm;
import com.learning.usercenter.entity.param.UserQueryParam;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Past;
import java.util.Date;

/**
 * @author Zzz
 */
@Data
public class UserQueryForm extends BaseQueryForm<UserQueryParam> {

    private String username;

    private String name;

    private String mobile;

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
