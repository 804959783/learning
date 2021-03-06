package com.learning.usercenter.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.learning.usercenter.entity.param.RoleQueryParam;
import com.learning.usercenter.entity.po.Role;

import java.util.List;

/**
 * @author Zzz
 * @date 2021年8月11日10:17:53
 */
public interface IRoleService {
    /**
     * 获取角色
     *
     * @param id
     * @return
     */
    Role get(Long id);

    /**
     * 获取所有角色
     *
     * @return
     */
    List<Role> getAll();

    /**
     * 新增角色
     *
     * @param role
     * @return
     */
    boolean add(Role role);

    /**
     * 查询角色
     *
     * @return
     */
    IPage<Role> query(Page page, RoleQueryParam roleQueryParam);

    /**
     * 根据用户id查询用户拥有的角色
     *
     * @return
     */
    List<Role> query(Long userId);

    /**
     * 更新角色信息
     *
     * @param role
     */
    boolean update(Role role);

    /**
     * 根据id删除角色
     *
     * @param id
     */
    boolean delete(Long id);
}
