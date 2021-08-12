package com.learning.usercenter.service;

import com.learning.usercenter.entity.param.PositionQueryParam;
import com.learning.usercenter.entity.po.Position;

import java.util.List;

/**
 * @author Zzz
 * @date 2021年8月11日10:15:16
 */
public interface IPositionService {
    /**
     * 获取职位
     *
     * @param id
     * @return
     */
    Position get(Long id);

    /**
     * 新增职位
     *
     * @param position
     * @return
     */
    boolean add(Position position);

    /**
     * 查询职位
     *
     * @return
     */
    List<Position> query(PositionQueryParam positionQueryParam);

    /**
     * 更新职位信息
     *
     * @param position
     */
    boolean update(Position position);

    /**
     * 根据id删除职位
     *
     * @param id
     */
    boolean delete(Long id);
}
