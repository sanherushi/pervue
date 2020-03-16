package com.majingji.pervue.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.majingji.pervue.entity.Goods;
import com.majingji.pervue.entity.GoodsVo;
import com.majingji.pervue.mapper.GoodsMapper;
import com.majingji.pervue.service.IGoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mjj
 * @since 2020-03-15
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements IGoodsService {
    @Resource
    private GoodsMapper goodsMapper;
    @Override
    public IPage<GoodsVo> selectPageVo(Page page, GoodsVo goodsVo) {
        return goodsMapper.selectPageVo(page,goodsVo);
    }
}
