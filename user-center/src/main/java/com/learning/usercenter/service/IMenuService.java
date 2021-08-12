package com.learning.usercenter.service;


import com.learning.usercenter.entity.param.MenuQueryParam;
import com.learning.usercenter.entity.po.Menu;

import java.util.List;

/**
 * @author Zzz
 * @date 2021年8月11日10:15:26
 */
public interface IMenuService {
    /**
     * 获取菜单
     *
     * @param id
     * @return
     */
    Menu get(Long id);

    /**
     * 新增菜单
     *
     * @param menu
     * @return
     */
    boolean add(Menu menu);

    /**
     * 查询菜单
     *
     * @return
     */
    List<Menu> query(MenuQueryParam menuQueryParam);

    /**
     * 根据父id查询菜单
     *
     * @return
     */
    List<Menu> queryByParentId(Long id);

    /**
     * 更新菜单信息
     *
     * @param menu
     */
    boolean update(Menu menu);

    /**
     * 根据id删除菜单
     *
     * @param id
     */
    boolean delete(Long id);
}
