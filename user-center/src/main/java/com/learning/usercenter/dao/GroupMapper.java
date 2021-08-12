package com.learning.usercenter.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.learning.usercenter.entity.po.Group;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author Zzz
 * @date 2021/8/11 9:42
 */
@Mapper
@Repository
public interface GroupMapper extends BaseMapper<Group> {
}
