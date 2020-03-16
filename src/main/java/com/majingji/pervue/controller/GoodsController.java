package com.majingji.pervue.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.majingji.pervue.entity.Goods;
import com.majingji.pervue.entity.GoodsVo;
import com.majingji.pervue.entity.Goods_sales;
import com.majingji.pervue.service.IGoodsService;
import com.majingji.pervue.service.IGoods_salesService;
import com.majingji.pervue.service.ISalesService;
import com.majingji.pervue.vo.ResultEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author mjj
 * @since 2020-03-15
 */
@RestController
@RequestMapping("/goods")
public class GoodsController {
    @Autowired
    private IGoodsService iGoodsService;
    @Autowired
    private IGoods_salesService iGoods_salesService;
    @RequestMapping("/list")
    public ResultEntity list(@RequestParam(defaultValue = "1")long current, @RequestParam(defaultValue = "2")long size, GoodsVo goodsVo){
        Page page = new Page(current, size);
        return ResultEntity.ok(iGoodsService.selectPageVo(page,goodsVo));
    }

    @RequestMapping("/delete")
    public ResultEntity delete(Integer [] ids){
        QueryWrapper<Goods_sales> qw = new QueryWrapper<>();
        for (Integer id:ids
             ) {
            qw.eq("gid",id);
        }
        iGoods_salesService.remove(qw);
        boolean flag = iGoodsService.removeByIds(Arrays.asList(ids));
        return ResultEntity.ok(flag);
    }

    @RequestMapping("/insert")
    public ResultEntity insert(@RequestBody Goods goods){
        //商品的添加
        //goods.setCreate(new Date());
//        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//        goods.setCreate(new Date(timestamp.getTime()));
        return ResultEntity.ok(iGoodsService.save(goods));
    }

}

