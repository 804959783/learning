package com.learning.usercenter.rest;

import com.learning.usercenter.common.entity.vo.Result;
import com.learning.usercenter.entity.form.GroupForm;
import com.learning.usercenter.entity.form.GroupQueryForm;
import com.learning.usercenter.entity.param.GroupQueryParam;
import com.learning.usercenter.entity.po.Group;
import com.learning.usercenter.service.IGroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author Zzz
 */
@RestController
@RequestMapping("/group")
@Slf4j
public class GroupController {

    @Autowired
    private IGroupService groupService;

    @PostMapping
    public Result add(@Valid @RequestBody GroupForm groupForm) {
        log.debug("name:{}", groupForm);
        return Result.success(groupService.add(groupForm.toPo(Group.class)));
    }

    @DeleteMapping(value = "/{id}")
    public Result delete(@PathVariable Long id) {
        return Result.success(groupService.delete(id));
    }

    @PutMapping(value = "/{id}")
    public Result update(@PathVariable Long id, @Valid @RequestBody GroupForm groupForm) {
        Group group = groupForm.toPo(Group.class);
        group.setId(id);
        return Result.success(groupService.update(group));
    }

    @GetMapping(value = "/{id}")
    public Result get(@PathVariable Long id) {
        log.debug("get with id:{}", id);
        return Result.success(groupService.get(id));
    }

    @GetMapping
    public Result query(@RequestParam String name) {
        log.debug("query with name:{}", name);
        GroupQueryParam groupQueryParam = new GroupQueryParam();
        groupQueryParam.setName(name);
        return Result.success(groupService.query(groupQueryParam));
    }

    /**
     * 根据条件查询用户组信息
     *
     * @param groupQueryForm
     * @return
     */
    @PostMapping(value = "/conditions")
    public Result search(@Valid @RequestBody GroupQueryForm groupQueryForm) {
        log.debug("search with groupQueryForm:{}", groupQueryForm);
        return Result.success(groupService.query(groupQueryForm.toParam(GroupQueryParam.class)));
    }

    /**
     * 根据父id查询用户组列表
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/parent/{id}")
    public Result search(@PathVariable Long id) {
        log.debug("query with parent id:{}", id);
        return Result.success(groupService.queryByParentId(id));
    }
}