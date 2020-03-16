package com.majingji.pervue.mapper;

import com.majingji.pervue.entity.Nation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.majingji.pervue.vo.NationVo;

import java.util.List;

/**
 * <p>
 * 城市字典表 Mapper 接口
 * </p>
 *
 * @author mjj
 * @since 2020-03-03
 */
public interface NationMapper extends BaseMapper<Nation> {
    List<NationVo> findAll();
}
