package com.majingji.pervue.service.impl;

import com.majingji.pervue.entity.District;
import com.majingji.pervue.entity.DistrictVo;
import com.majingji.pervue.mapper.DistrictMapper;
import com.majingji.pervue.service.IDistrictService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mjj
 * @since 2020-03-15
 */
@Service
public class DistrictServiceImpl extends ServiceImpl<DistrictMapper, District> implements IDistrictService {
    @Resource
    private DistrictMapper districtMapper;
    @Override
    public List<DistrictVo> dlist() {
        return districtMapper.dlist();
    }
}
