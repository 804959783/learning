package com.learning.usercenter.common.entity.param;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.learning.usercenter.common.entity.po.BaseEntity;
import lombok.Data;

import java.util.Date;

/**
 *
 * @author Zzz
 * @date 2021年8月11日10:03:50
 * @param <T>
 */
@Data
public class BaseParam<T extends BaseEntity> {
    private Date createdTimeStart;
    private Date createdTimeEnd;

    public QueryWrapper<T> build() {
        QueryWrapper<T> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge(null != this.createdTimeStart, "created_time", this.createdTimeStart)
                .le(null != this.createdTimeEnd, "created_time", this.createdTimeEnd);
        return queryWrapper;
    }
}
