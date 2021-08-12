package com.learning.usercenter.rest;

import com.learning.usercenter.common.entity.vo.Result;
import com.learning.usercenter.entity.form.MenuForm;
import com.learning.usercenter.entity.form.MenuQueryForm;
import com.learning.usercenter.entity.param.MenuQueryParam;
import com.learning.usercenter.entity.po.Menu;
import com.learning.usercenter.service.IMenuService;
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

@RestController
@RequestMapping("/menu")
@Slf4j
public class MenuController {

    @Autowired
    private IMenuService menuService;

    /**
     * 新增菜单
     *
     * @param menuForm
     * @return
     */
    @PostMapping
    public Result add(@Valid @RequestBody MenuForm menuForm) {
        log.debug("name:{}", menuForm);
        Menu menu = menuForm.toPo(Menu.class);
        return Result.success(menuService.add(menu));
    }

    /**
     * 根据url的id来指定删除对象
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}")
    public Result delete(@PathVariable Long id) {
        return Result.success(menuService.delete(id));
    }

    /**
     * 修改指定菜单信息
     *
     * @param id
     * @param menuForm
     * @return
     */
    @PutMapping(value = "/{id}")
    public Result update(@PathVariable Long id, @Valid @RequestBody MenuForm menuForm) {
        Menu menu = menuForm.toPo(Menu.class);
        menu.setId(id);
        return Result.success(menuService.update(menu));
    }

    /**
     * 获取指定菜单信息
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    public Result get(@PathVariable Long id) {
        log.debug("get with id:{}", id);
        return Result.success(menuService.get(id));
    }

    /**
     * 根据条件查询菜单信息，简单查询
     *
     * @param name
     * @return
     */
    @GetMapping
    public Result query(@RequestParam String name) {
        log.debug("query with name:{}", name);
        MenuQueryParam menuQueryParam = new MenuQueryParam(name);
        return Result.success(menuService.query(menuQueryParam));
    }

    /**
     * 根据条件查询菜单信息
     *
     * @param menuQueryForm
     * @return
     */
    @PostMapping(value = "/conditions")
    public Result search(@Valid @RequestBody MenuQueryForm menuQueryForm) {
        log.debug("search with menuQueryForm:{}", menuQueryForm);
        return Result.success(menuService.query(menuQueryForm.toParam(MenuQueryParam.class)));
    }

    /**
     * 根据父id查询菜单列表
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/parent/{id}")
    public Result search(@PathVariable Long id) {
        log.debug("query with parent id:{}", id);
        return Result.success(menuService.queryByParentId(id));
    }
}