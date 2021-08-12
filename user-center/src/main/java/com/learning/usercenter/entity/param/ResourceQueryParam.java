package com.learning.usercenter.entity.param;

import com.learning.usercenter.common.entity.param.BaseParam;
import com.learning.usercenter.entity.po.Resource;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zzz
 * @date 2021年8月11日10:08:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResourceQueryParam extends BaseParam<Resource> {

    private String name;

    private String code;

    private String type;

    private String url;

    private String method;
}
