package com.majingji.pervue.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.majingji.pervue.entity.User_role;
import com.majingji.pervue.service.IUser_roleService;
import com.majingji.pervue.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/user_role")
public class User_roleController {
    @Autowired
    private IUser_roleService iUser_roleService;
    @RequestMapping("/insert")
    public ResultEntity insert(Integer uid,Integer [] rids){
        System.out.println(rids+"===================================");
        //先执行删除方法
        QueryWrapper<User_role> qw = new QueryWrapper<>();
        qw.eq("uid",uid);
        iUser_roleService.remove(qw);
        if(rids!=null && rids.length>0){
            ArrayList<User_role> list = new ArrayList<>();
            for (Integer rid: rids) {
                System.out.println(rid+"============================");
                User_role ur = new User_role();
                ur.setRid(rid);
                ur.setUid(uid);
                list.add(ur);
            }

        //再执行批量添加
        iUser_roleService.saveBatch(list);
        }
        //返回执行的结果
        return ResultEntity.ok(true);
    }

}

