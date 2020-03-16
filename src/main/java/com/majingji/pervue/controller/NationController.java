package com.majingji.pervue.controller;


import com.majingji.pervue.service.INationService;
import com.majingji.pervue.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 城市字典表 前端控制器
 * </p>
 *
 * @author mjj
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/nation")
public class NationController {
    @Autowired
    private INationService iNationService;
    @RequestMapping("/list")
    public ResultEntity findAll(){
        return ResultEntity.ok(iNationService.findAll());
    }

}

