package com.majingji.pervue.mapper;

import com.majingji.pervue.entity.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author mjj
 * @since 2020-03-03
 */
public interface MenuMapper extends BaseMapper<Menu> {
    List<Menu> listMenus();
    List<Menu> listMenusbyUserName(String username);
}
