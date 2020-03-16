package com.majingji.pervue.mapper;

import com.majingji.pervue.entity.District;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.majingji.pervue.entity.DistrictVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mjj
 * @since 2020-03-15
 */
public interface DistrictMapper extends BaseMapper<District> {
    List<DistrictVo> dlist();
}
