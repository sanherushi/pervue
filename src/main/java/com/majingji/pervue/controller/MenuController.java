package com.majingji.pervue.controller;


import com.majingji.pervue.entity.User;
import com.majingji.pervue.service.IMenuService;
import com.majingji.pervue.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mjj
 * @since 2020-03-03
 */
@RestController
@RequestMapping("/menu")
public class MenuController {
    @Autowired
    private IMenuService iMenuService;
    @RequestMapping("/list")
    public ResultEntity list(){
        return ResultEntity.ok(iMenuService.listMenus());
    }

    @RequestMapping("/listMenusbyUserName")
    public ResultEntity listMenusbyUserName(HttpServletRequest request, @RequestParam(defaultValue = "lisi") String userName){
        User user = (User) request.getSession().getAttribute("user");
        if(user !=null){
            //获取到session中存放的登录用户的姓名
            userName = user.getUsername();
        }
        return ResultEntity.ok(iMenuService.listMenusbyUserName(userName));
    }
}

