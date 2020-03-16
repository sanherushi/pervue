package com.majingji.pervue.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.majingji.pervue.entity.Scenic;
import com.majingji.pervue.entity.ScenicVo;
import com.majingji.pervue.mapper.ScenicMapper;
import com.majingji.pervue.service.IScenicService;
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
public class ScenicServiceImpl extends ServiceImpl<ScenicMapper, Scenic> implements IScenicService {
    @Resource
    private ScenicMapper scenicMapper;
    @Override
    public IPage<ScenicVo> selectPageVo(Page page, ScenicVo scenicVo) {
        return scenicMapper.selectPageVo(page,scenicVo);
    }
}
