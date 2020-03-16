package com.majingji.pervue.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.majingji.pervue.entity.Scenic;
import com.baomidou.mybatisplus.extension.service.IService;
import com.majingji.pervue.entity.ScenicVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mjj
 * @since 2020-03-15
 */
public interface IScenicService extends IService<Scenic> {
    IPage<ScenicVo> selectPageVo(Page page, ScenicVo scenicVo);
}
