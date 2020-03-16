package com.majingji.pervue.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.majingji.pervue.entity.Menu_role;
import com.majingji.pervue.service.IMenu_roleService;
import com.majingji.pervue.vo.ResultEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mjj
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/menu_role")
public class Menu_roleController {
    @Resource
    private IMenu_roleService iMenu_roleService;
    @RequestMapping("/insert")
    public ResultEntity insert(Integer rid,Integer [] mids){
        System.out.println(rid);
//        for (int i = 0; i < mids.length; i++) {
//            System.out.println(mids[i]+"===========");
//        }
        QueryWrapper<Menu_role> qw = new QueryWrapper<>();
        qw.eq("rid",rid);
        iMenu_roleService.remove(qw);
        ArrayList<Menu_role> list = new ArrayList<>();
        for (Integer mid:mids
             ) {
            Menu_role mr = new Menu_role();
            mr.setRid(rid);
            mr.setMid(mid);
            list.add(mr);
        }
        //批量添加
        boolean flag = iMenu_roleService.saveBatch(list);
        return ResultEntity.ok(flag);
    }

}

