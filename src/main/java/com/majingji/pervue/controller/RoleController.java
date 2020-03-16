package com.majingji.pervue.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.majingji.pervue.entity.Menu_role;
import com.majingji.pervue.entity.Role;
import com.majingji.pervue.service.IMenu_roleService;
import com.majingji.pervue.service.IRoleService;
import com.majingji.pervue.vo.ResultEntity;
import com.majingji.pervue.vo.RoleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private IRoleService iRoleService;
    @Autowired
    private IMenu_roleService iMenu_roleService;
    @RequestMapping("/list")
    public ResultEntity list(){
        return ResultEntity.ok(iRoleService.list());
    }
    @RequestMapping("/select")
    public ResultEntity selectPageVo(@RequestParam(defaultValue = "1")long current, @RequestParam(defaultValue = "3")long size, RoleVo roleVo){
        Page<RoleVo> page = new Page<>(current, size);
        IPage<RoleVo> pageInfo = iRoleService.selectPageVo(page, roleVo);
        return ResultEntity.ok(pageInfo);
    }

    @RequestMapping("/deletes")
    public ResultEntity deletes(Integer [] ids){
        //先删除连接有外键的表中字段
        for (Integer id: ids
             ) {
            QueryWrapper<Menu_role> qw = new QueryWrapper<>();
            qw.eq("rid",id);
            iMenu_roleService.remove(qw);
        }
        //再删除表中的字段
        boolean flag = iRoleService.removeByIds(Arrays.asList(ids));
        return ResultEntity.ok(flag);
    }

    @RequestMapping("/update")
    public ResultEntity update(@RequestBody Role role){
        boolean flag = iRoleService.updateById(role);
        return ResultEntity.ok(flag);
    }
}

