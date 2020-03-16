package com.majingji.pervue.service.impl;

import com.majingji.pervue.entity.Nation;
import com.majingji.pervue.mapper.NationMapper;
import com.majingji.pervue.service.INationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.majingji.pervue.vo.NationVo;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 城市字典表 服务实现类
 * </p>
 *
 * @author mjj
 * @since 2020-03-03
 */
@Service
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {
    @Resource
    private NationMapper nationMapper;
    @Override
    @Cacheable(value = "pervue",key = "'nlist'")
    public List<NationVo> findAll() {
        System.out.println("进入方法了==============================");
        return nationMapper.findAll();
    }
}
