package com.learning.usercenter.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.learning.usercenter.entity.param.UserQueryParam;
import com.learning.usercenter.entity.po.User;
import com.learning.usercenter.entity.vo.UserVo;

/**
 * @author Zzz
 * @date 2021年8月11日10:17:36
 */
public interface IUserService {
    /**
     * 获取用户
     *
     * @param id 用户id
     * @return UserVo
     */
    UserVo get(Long id);

    /**
     * 根据用户唯一标识获取用户信息
     * 目前用户标识不用户名或mobile
     *
     * @param uniqueId
     * @return
     */
    User getByUniqueId(Long uniqueId);

    /**
     * 新增用户
     *
     * @param user
     * @return
     */
    boolean add(User user);

    /**
     * 查询用户
     *
     * @return
     */
    IPage<UserVo> query(Page<User> page, UserQueryParam userQueryParam);

    /**
     * 更新用户信息
     *
     * @param user
     */
    boolean update(User user);

    /**
     * 根据id删除用户
     *
     * @param id
     */
    boolean delete(Long id);
}
