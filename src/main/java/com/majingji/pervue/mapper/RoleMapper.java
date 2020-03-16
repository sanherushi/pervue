package com.majingji.pervue.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.majingji.pervue.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.majingji.pervue.vo.RoleVo;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mjj
 * @since 2020-03-03
 */
public interface RoleMapper extends BaseMapper<Role> {
    IPage<RoleVo> selectPageVo(Page page, RoleVo roleVo);
}
