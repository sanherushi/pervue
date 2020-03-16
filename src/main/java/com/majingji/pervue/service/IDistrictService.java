package com.majingji.pervue.service;

import com.majingji.pervue.entity.District;
import com.baomidou.mybatisplus.extension.service.IService;
import com.majingji.pervue.entity.DistrictVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mjj
 * @since 2020-03-15
 */
public interface IDistrictService extends IService<District> {
    List<DistrictVo> dlist();
}
