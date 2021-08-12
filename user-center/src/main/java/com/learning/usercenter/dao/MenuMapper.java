package com.learning.usercenter.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.learning.usercenter.entity.po.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Zzz
 * @date 2021/8/11 9:44
 */
@Mapper
@Repository
public interface MenuMapper extends BaseMapper<Menu> {
}
