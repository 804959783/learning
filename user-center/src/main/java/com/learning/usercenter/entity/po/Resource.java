package com.learning.usercenter.entity.po;

import com.learning.usercenter.common.entity.po.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Zzz
 * @date 2021年8月11日09:40:14
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Resource extends BaseEntity implements Serializable {

    private static final long serialVersionUID = -1430870728251549313L;

    private String code;

    private String type;

    private String url;

    private String method;

    private String name;

    private String description;
}
