package com.learning.usercenter.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.learning.usercenter.common.entity.po.BaseEntity;
import com.learning.usercenter.dao.ResourceMapper;
import com.learning.usercenter.entity.param.ResourceQueryParam;
import com.learning.usercenter.entity.po.Resource;
import com.learning.usercenter.entity.po.Role;
import com.learning.usercenter.entity.po.RoleResource;
import com.learning.usercenter.entity.po.User;
import com.learning.usercenter.service.IResourceService;
import com.learning.usercenter.service.IRoleResourceService;
import com.learning.usercenter.service.IRoleService;
import com.learning.usercenter.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Zzz
 * @date 2021年8月11日10:46:48
 */
@Service
@Slf4j
public class ResourceServiceImpl extends ServiceImpl<ResourceMapper, Resource> implements IResourceService {

    @Autowired
    private IRoleResourceService roleResourceService;

    @Autowired
    private IRoleService roleService;

    @Autowired
    private IUserService userService;

    @Override
    public boolean add(Resource resource) {
        return this.save(resource);
    }

    @Override
    public boolean delete(Long id) {
        return this.removeById(id);
    }

    @Override
    public boolean update(Resource resource) {
        return this.updateById(resource);
    }

    @Override
    public Resource get(Long id) {
        return this.getById(id);
    }

    @Override
    public IPage<Resource> query(Page page, ResourceQueryParam resourceQueryParam) {
        QueryWrapper<Resource> queryWrapper = resourceQueryParam.build();
        queryWrapper.eq(StringUtils.isNotBlank(resourceQueryParam.getName()), "name", resourceQueryParam.getName());
        queryWrapper.eq(StringUtils.isNotBlank(resourceQueryParam.getType()), "type", resourceQueryParam.getType());
        queryWrapper.eq(StringUtils.isNotBlank(resourceQueryParam.getUrl()), "url", resourceQueryParam.getUrl());
        queryWrapper.eq(StringUtils.isNotBlank(resourceQueryParam.getMethod()), "method", resourceQueryParam.getMethod());
        return this.page(page, queryWrapper);
    }

    @Override
    public List<Resource> getAll() {
        return this.list();
    }

    @Override
    public List<Resource> query(Long uniqueId) {
        //根据用户名查询到用户所拥有的角色
        User user = userService.getByUniqueId(uniqueId);
        List<Role> roles = roleService.query(user.getId());
        //提取用户所拥有角色id列表
        Set<Long> roleIds = roles.stream().map(BaseEntity::getId).collect(Collectors.toSet());
        //根据角色列表查询到角色的资源的关联关系
        List<RoleResource> roleResources = roleResourceService.queryByRoleIds(roleIds);
        //根据资源列表查询出所有资源对象
        Set<Long> resourceIds = roleResources.stream().map(RoleResource::getResourceId).collect(Collectors.toSet());
        //根据resourceId列表查询出resource对象
        return this.listByIds(resourceIds);
    }
}
