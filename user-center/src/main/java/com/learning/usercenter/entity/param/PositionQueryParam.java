package com.learning.usercenter.entity.param;

import com.learning.usercenter.common.entity.param.BaseParam;
import com.learning.usercenter.entity.po.Position;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Zzz
 * @date 2021年8月11日10:08:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PositionQueryParam extends BaseParam<Position> {

    private String name;
}
