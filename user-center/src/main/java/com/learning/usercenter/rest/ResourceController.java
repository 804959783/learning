package com.learning.usercenter.rest;

import com.learning.usercenter.common.entity.vo.Result;
import com.learning.usercenter.entity.form.ResourceForm;
import com.learning.usercenter.entity.form.ResourceQueryForm;
import com.learning.usercenter.entity.param.ResourceQueryParam;
import com.learning.usercenter.entity.po.Resource;
import com.learning.usercenter.service.IResourceService;
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
@RequestMapping("/resource")
@Slf4j
public class ResourceController {

    @Autowired
    private IResourceService resourceService;

    /**
     * 新增资源
     *
     * @param resourceForm
     * @return
     */
    @PostMapping
    public Result add(@Valid @RequestBody ResourceForm resourceForm) {
        log.debug("name:{}", resourceForm);
        Resource resource = resourceForm.toPo(Resource.class);
        return Result.success(resourceService.add(resource));
    }

    /**
     * 删除资源
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}")
    public Result delete(@PathVariable Long id) {
        return Result.success(resourceService.delete(id));
    }

    /**
     * 修改资源
     *
     * @param id
     * @param resourceForm
     * @return
     */
    @PutMapping(value = "/{id}")
    public Result update(@PathVariable Long id, @Valid @RequestBody ResourceForm resourceForm) {
        Resource resource = resourceForm.toPo(id, Resource.class);
        return Result.success(resourceService.update(resource));
    }

    /**
     * 获取资源
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    public Result get(@PathVariable Long id) {
        log.debug("get with id:{}", id);
        return Result.success(resourceService.get(id));
    }

    /**
     * 根据uniqueId查询用户所拥有的资源信息
     *
     * @param uniqueId
     * @return
     */
    @GetMapping(value = "/user/{uniqueId}")
    public Result queryByUsername(@PathVariable Long uniqueId) {
        log.debug("query with uniqueId:{}", uniqueId);
        return Result.success(resourceService.query(uniqueId));
    }

    /**
     * 查询所有资源
     *
     * @return
     */
    @GetMapping(value = "/all")
    public Result queryAll() {
        return Result.success(resourceService.getAll());
    }

    /**
     * 根据条件搜索资源信息
     *
     * @param resourceQueryForm
     * @return
     */
    @PostMapping(value = "/conditions")
    public Result query(@Valid @RequestBody ResourceQueryForm resourceQueryForm) {
        log.debug("query with name:{}", resourceQueryForm);
        return Result.success(resourceService.query(resourceQueryForm.getPage(), resourceQueryForm.toParam(ResourceQueryParam.class)));
    }
}