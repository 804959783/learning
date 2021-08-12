package com.learning.usercenter.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.learning.usercenter.dao.GroupMapper;
import com.learning.usercenter.entity.param.GroupQueryParam;
import com.learning.usercenter.entity.po.Group;
import com.learning.usercenter.service.IGroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zzz
 * @date 2021年8月11日10:46:14
 */
@Service
@Slf4j
public class GroupServiceImpl extends ServiceImpl<GroupMapper, Group> implements IGroupService {

    @Override
    public boolean add(Group group) {
        return this.save(group);
    }

    @Override
    public boolean delete(Long id) {
        return this.removeById(id);
    }

    @Override
    public boolean update(Group group) {
        return this.updateById(group);
    }

    @Override
    public Group get(Long id) {
        return this.getById(id);
    }

    @Override
    public List<Group> query(GroupQueryParam groupQueryParam) {
        QueryWrapper<Group> queryWrapper = groupQueryParam.build();
        queryWrapper.eq("name", groupQueryParam.getName());
        return this.list(queryWrapper);
    }

    @Override
    public List<Group> queryByParentId(Long id) {
        return this.list(new QueryWrapper<Group>().eq("parent_id", id));
    }
}
