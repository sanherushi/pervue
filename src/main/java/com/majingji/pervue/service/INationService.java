package com.majingji.pervue.service;

import com.majingji.pervue.entity.Nation;
import com.baomidou.mybatisplus.extension.service.IService;
import com.majingji.pervue.vo.NationVo;

import java.util.List;

/**
 * <p>
 * 城市字典表 服务类
 * </p>
 *
 * @author mjj
 * @since 2020-03-03
 */
public interface INationService extends IService<Nation> {
    List<NationVo> findAll();
}
