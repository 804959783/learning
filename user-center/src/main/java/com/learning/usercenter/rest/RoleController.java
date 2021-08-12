package com.learning.usercenter.rest;

import com.learning.usercenter.common.entity.vo.Result;
import com.learning.usercenter.entity.form.RoleForm;
import com.learning.usercenter.entity.form.RoleQueryForm;
import com.learning.usercenter.entity.form.RoleUpdateForm;
import com.learning.usercenter.entity.param.RoleQueryParam;
import com.learning.usercenter.entity.po.Role;
import com.learning.usercenter.service.IRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author Zzz
 */
@RestController
@RequestMapping("/role")
@Slf4j
public class RoleController {

    @Autowired
    private IRoleService roleService;

    /**
     * 新增角色
     *
     * @param roleForm
     * @return
     */
    @PostMapping
    public Result add(@Valid @RequestBody RoleForm roleForm) {
        log.debug("name:{}", roleForm);
        Role role = roleForm.toPo(Role.class);
        return Result.success(roleService.add(role));
    }

    /**
     * 删除角色
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}")
    public Result delete(@PathVariable Long id) {
        return Result.success(roleService.delete(id));
    }

    /**
     * 修改角色
     *
     * @param id
     * @param roleUpdateForm
     * @return
     */
    @PutMapping(value = "/{id}")
    public Result update(@PathVariable Long id, @Valid @RequestBody RoleUpdateForm roleUpdateForm) {
        Role role = roleUpdateForm.toPo(id, Role.class);
        return Result.success(roleService.update(role));
    }

    /**
     * 获取角色
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    public Result get(@PathVariable Long id) {
        log.debug("get with id:{}", id);
        return Result.success(roleService.get(id));
    }

    /**
     * 获取所有角色
     *
     * @return
     */
    @GetMapping(value = "/all")
    public Result get() {
        return Result.success(roleService.getAll());
    }

    /**
     * 根据用户id查询用户所拥有的角色信息
     *
     * @param userId
     * @return
     */
    @GetMapping(value = "/user/{userId}")
    public Result query(@PathVariable Long userId) {
        log.debug("query with userId:{}", userId);
        return Result.success(roleService.query(userId));
    }

    /**
     * 根据条件搜索角色信息
     *
     * @param roleQueryForm
     * @return
     */
    @PostMapping(value = "/conditions")
    public Result query(@Valid @RequestBody RoleQueryForm roleQueryForm) {
        log.debug("query with name:{}", roleQueryForm);
        return Result.success(roleService.query(roleQueryForm.getPage(), roleQueryForm.toParam(RoleQueryParam.class)));
    }
}