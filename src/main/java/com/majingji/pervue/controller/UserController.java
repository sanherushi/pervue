package com.majingji.pervue.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.majingji.pervue.entity.User;
import com.majingji.pervue.entity.UserVo;
import com.majingji.pervue.service.IUserService;
import com.majingji.pervue.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.xml.transform.Result;
import java.util.Arrays;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mjj
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService iUserService;
    @RequestMapping("/list")
    public ResultEntity list(@RequestParam(defaultValue = "1")long current, @RequestParam(defaultValue = "3")long size,UserVo userVo){
        Page<User> pg = new Page<>(current, size);
        IPage<UserVo> pageInfo = iUserService.selectPageVo(pg, userVo);
        return ResultEntity.ok(pageInfo);
    }

    @RequestMapping("/removeByIds")
    public ResultEntity deletebyId(Integer [] ids){
        boolean flag = iUserService.removeByIds(Arrays.asList(ids));
        return ResultEntity.ok(flag);
    }

    @RequestMapping("/insert")
    public ResultEntity insert(@RequestBody User user){
        //因为返回的是json类型的数据,@RequestBody注解用来解析json类型的数据
        System.out.println(user+"=========================");
        boolean flag = iUserService.save(user);
        return ResultEntity.ok(flag);
    }
    @RequestMapping("/update")
    public ResultEntity update(@RequestBody User user){
        System.out.println(user+"===========================");
        boolean flag = iUserService.updateById(user);
        return ResultEntity.ok(flag);
    }

    @RequestMapping("/login")
    public ResultEntity login(HttpServletRequest request,@RequestBody User user){
        QueryWrapper<User> qw = new QueryWrapper<>();
        qw.eq("username",user.getUsername()).eq("password",user.getPassword());
        User user1 = iUserService.getOne(qw);
        if(user1!=null){
            request.getSession().setAttribute("user",user1);
            return ResultEntity.ok(user1);
        }
        return ResultEntity.err("用户名或密码错误",10001,null);
    }

    @RequestMapping("/loginOut")
    public ResultEntity loginOut(HttpServletRequest request){
       request.getSession().removeAttribute("user");
       return ResultEntity.ok(true);
    }

}

