package com.majingji.pervue.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.majingji.pervue.entity.Goods;
import com.baomidou.mybatisplus.extension.service.IService;
import com.majingji.pervue.entity.GoodsVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mjj
 * @since 2020-03-15
 */
public interface IGoodsService extends IService<Goods> {
    IPage<GoodsVo> selectPageVo(Page page, GoodsVo goodsVo);

}
