package com.learning.usercenter.rest;

import com.learning.usercenter.common.entity.vo.Result;
import com.learning.usercenter.entity.form.PositionForm;
import com.learning.usercenter.entity.param.PositionQueryParam;
import com.learning.usercenter.entity.po.Position;
import com.learning.usercenter.service.IPositionService;
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
@RequestMapping("/position")
@Slf4j
public class PositionController {

    @Autowired
    private IPositionService positionService;

    /**
     * 新增职位
     *
     * @param positionForm
     * @return
     */
    @PostMapping
    public Result add(@Valid @RequestBody PositionForm positionForm) {
        log.debug("name:{}", positionForm);
        Position position = positionForm.toPo(Position.class);
        return Result.success(positionService.add(position));
    }

    /**
     * 删除职位
     *
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}")
    public Result delete(@PathVariable Long id) {
        return Result.success(positionService.delete(id));
    }

    /**
     * 修改指定职位信息
     *
     * @param id
     * @param positionForm
     * @return
     */
    @PutMapping(value = "/{id}")
    public Result update(@PathVariable Long id, @Valid @RequestBody PositionForm positionForm) {
        Position position = positionForm.toPo(Position.class);
        position.setId(id);
        return Result.success(positionService.update(position));
    }

    /**
     * 获取指定职位信息
     *
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    public Result get(@PathVariable Long id) {
        log.debug("get with id:{}", id);
        return Result.success(positionService.get(id));
    }

    /**
     * 查询职位
     *
     * @param name
     * @return
     */
    @GetMapping
    public Result query(@RequestParam String name) {
        log.debug("query with name:{}", name);
        return Result.success(positionService.query(new PositionQueryParam(name)));
    }
}