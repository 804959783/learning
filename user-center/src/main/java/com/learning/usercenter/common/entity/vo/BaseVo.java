package com.learning.usercenter.common.entity.vo;

import com.learning.usercenter.common.entity.po.BaseEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Zzz
 * @date 2021年8月11日10:17:00
 */
@Data
@NoArgsConstructor
public class BaseVo<T extends BaseEntity> implements Serializable {

    private static final long serialVersionUID = -5535408603460860478L;

    private Long id;
}
