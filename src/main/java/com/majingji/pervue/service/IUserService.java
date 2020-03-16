package com.majingji.pervue.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.majingji.pervue.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.majingji.pervue.entity.UserVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mjj
 * @since 2020-03-03
 */
public interface IUserService extends IService<User> {
    IPage<UserVo> selectPageVo(Page page, UserVo userVo);
}
