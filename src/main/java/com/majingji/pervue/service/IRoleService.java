package com.majingji.pervue.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.majingji.pervue.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;
import com.majingji.pervue.vo.RoleVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mjj
 * @since 2020-03-03
 */
public interface IRoleService extends IService<Role> {
    IPage<RoleVo> selectPageVo(Page page, RoleVo roleVo);
}
