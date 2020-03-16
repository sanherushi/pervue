package com.majingji.pervue.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.majingji.pervue.entity.Scenic;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.majingji.pervue.entity.ScenicVo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mjj
 * @since 2020-03-15
 */
public interface ScenicMapper extends BaseMapper<Scenic> {
    IPage<ScenicVo> selectPageVo(Page page, ScenicVo scenicVo);
}
