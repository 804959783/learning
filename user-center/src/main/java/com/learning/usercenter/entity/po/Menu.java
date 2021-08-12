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
 * @date 2021/8/10 17:35
 */
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Menu extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 8138217951316108331L;

    private String parentId;

    private String name;

    private String type;

    private String href;

    private String icon;

    private int orderNum;

    private String description;
}
