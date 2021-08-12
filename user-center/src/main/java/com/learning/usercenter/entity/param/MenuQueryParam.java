package com.learning.usercenter.entity.param;

import com.learning.usercenter.common.entity.param.BaseParam;
import com.learning.usercenter.entity.po.Menu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zzz
 * @date 2021年8月11日10:04:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MenuQueryParam extends BaseParam<Menu> {

    private String name;
}
