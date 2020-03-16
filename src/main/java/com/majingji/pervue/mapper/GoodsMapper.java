package com.majingji.pervue.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.majingji.pervue.entity.Goods;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.majingji.pervue.entity.GoodsVo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mjj
 * @since 2020-03-15
 */
public interface GoodsMapper extends BaseMapper<Goods> {
    IPage<GoodsVo> selectPageVo(Page page, GoodsVo goodsVo);

}
