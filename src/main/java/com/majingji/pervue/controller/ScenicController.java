package com.majingji.pervue.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.majingji.pervue.entity.Scenic;
import com.majingji.pervue.entity.ScenicVo;
import com.majingji.pervue.service.IScenicService;
import com.majingji.pervue.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mjj
 * @since 2020-03-15
 */
@RestController
@RequestMapping("/scenic")
public class ScenicController {
    @Autowired
    private IScenicService iScenicService;
    @RequestMapping("/list")
    public ResultEntity list(@RequestParam(defaultValue = "1")long current, @RequestParam(defaultValue = "2")long size, ScenicVo scenicVo){
        Page<ScenicVo> page = new Page<>(current, size);
        return ResultEntity.ok(iScenicService.selectPageVo(page,scenicVo));
    }
    @RequestMapping("/delete")
    public ResultEntity delete(Integer id){
        return ResultEntity.ok(iScenicService.removeById(id));
    }
    @RequestMapping("/insert")
    public ResultEntity insert(@RequestBody Scenic scenic){
        return ResultEntity.ok(iScenicService.save(scenic));
    }
    @RequestMapping("/update")
    public ResultEntity update(@RequestBody Scenic scenic){
        return ResultEntity.ok(iScenicService.updateById(scenic));
    }

}

