package com.majingji.pervue.service;

import com.majingji.pervue.entity.Menu;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author mjj
 * @since 2020-03-03
 */
public interface IMenuService extends IService<Menu> {
    List<Menu> listMenus();
    List<Menu> listMenusbyUserName(String username);
}
