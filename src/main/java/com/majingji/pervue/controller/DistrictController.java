package com.majingji.pervue.controller;


import com.majingji.pervue.service.IDistrictService;
import com.majingji.pervue.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.events.Event;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mjj
 * @since 2020-03-15
 */
@RestController
@RequestMapping("/district")
public class DistrictController {
    @Autowired
    private IDistrictService iDistrictService;
    @RequestMapping("/list")
    public ResultEntity list(){
        return ResultEntity.ok(iDistrictService.dlist());
    }

}

