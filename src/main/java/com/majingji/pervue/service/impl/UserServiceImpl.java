package com.majingji.pervue.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.majingji.pervue.entity.User;
import com.majingji.pervue.entity.UserVo;
import com.majingji.pervue.mapper.UserMapper;
import com.majingji.pervue.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author mjj
 * @since 2020-03-03
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public IPage<UserVo> selectPageVo(Page page, UserVo userVo) {
        return userMapper.selectPageVo(page,userVo);
    }
}
