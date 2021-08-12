package com.learning.usercenter.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.learning.usercenter.entity.param.ResourceQueryParam;
import com.learning.usercenter.entity.po.Resource;

import java.util.List;

/**
 * @author Zzz
 * @date 2021年8月11日10:14:43
 */
public interface IResourceService {
    /**
     * 获取资源
     *
     * @param id
     * @return
     */
    Resource get(Long id);

    /**
     * 新增资源
     *
     * @param resource
     * @return
     */
    boolean add(Resource resource);

    /**
     * 查询资源,分页
     *
     * @return
     */
    IPage<Resource> query(Page page, ResourceQueryParam resourceQueryParam);

    /**
     * 查询所有资源
     *
     * @return
     */
    List<Resource> getAll();

    /**
     * 根据uniqueId查询角色拥有的资源
     *
     * @return
     */
    List<Resource> query(Long uniqueId);

    /**
     * 更新资源信息
     *
     * @param resource
     */
    boolean update(Resource resource);

    /**
     * 根据id删除资源
     *
     * @param id
     */
    boolean delete(Long id);
}
