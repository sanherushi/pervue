package com.majingji.pervue.controller;


import com.majingji.pervue.service.ITypeService;
import com.majingji.pervue.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
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
@RequestMapping("/type")
public class TypeController {
    @Autowired
    private ITypeService iTypeService;
    @RequestMapping("/list")
    public ResultEntity list(){
        return ResultEntity.ok(iTypeService.list());
    }

}

