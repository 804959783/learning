package com.learning.usercenter.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.learning.usercenter.dao.MenuMapper;
import com.learning.usercenter.entity.param.MenuQueryParam;
import com.learning.usercenter.entity.po.Menu;
import com.learning.usercenter.service.IMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Zzz
 * @date 2021年8月11日10:46:24
 */
@Service
@Slf4j
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

    @Override
    public boolean add(Menu menu) {
        return this.save(menu);
    }

    @Override
    public boolean delete(Long id) {
        return this.removeById(id);
    }

    @Override
    public boolean update(Menu menu) {
        return this.updateById(menu);
    }

    @Override
    public Menu get(Long id) {
        return this.getById(id);
    }

    @Override
    public List<Menu> query(MenuQueryParam menuQueryParam) {
        QueryWrapper<Menu> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq(null != menuQueryParam.getName(), "name", menuQueryParam.getName());
        return this.list(queryWrapper);
    }

    @Override
    public List<Menu> queryByParentId(Long id) {
        return this.list(new QueryWrapper<Menu>().eq("parent_id", id));
    }
}
