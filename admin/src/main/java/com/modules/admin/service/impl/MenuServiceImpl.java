package com.modules.admin.service.impl;

import com.modules.admin.entity.Menu;
import com.modules.admin.entity.MenuTree;
import com.modules.admin.feginService.OrderServiceClient;
import com.modules.admin.mapper.MenuMapper;
import com.modules.admin.service.IMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.modules.admin.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 
 * @since 2019-05-23
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements IMenuService {

    @Autowired
    MenuMapper menuMapper;

    @Autowired
    OrderServiceClient orderServiceClient;

    @Override
    public R getMenu() {
        return R.success("success",getRootMenu());
    }

    @Override
    public R getOrder(Map<String,Object> map) {
        return orderServiceClient.getOrder(map.get("page"),map.get("limit"));
    }

    public List<MenuTree> getRootMenu(){
        Map<String,Object> map = new HashMap<>();
        map.put("pid","0");
        List<Menu> menus = menuMapper.selectByMap(map);
        List<MenuTree> list = new ArrayList<>();
        for (Menu menu : menus) {
            MenuTree menuTree1 = new MenuTree();
            menuTree1.setId(menu.getId()+"");
            menuTree1.setHref(menu.getUrl());
            menuTree1.setName(menu.getName());
            list.add(menuTree1);
            getChildMenu(menuTree1);
        }
        return list;
    }

    public  void getChildMenu(MenuTree menuTree){
        String id = menuTree.getId();
        Map<String,Object> map = new HashMap<>();
        map.put("pid",id);
        List<Menu> menus = menuMapper.selectByMap(map);
        for (Menu menu : menus) {
            menuTree.initChild();
            MenuTree menuTree1 = new MenuTree();
            menuTree1.setId(menu.getId()+"");
            menuTree1.setHref(menu.getUrl());
            menuTree1.setName(menu.getName());
            menuTree.getChildren().add(menuTree1);
            getChildMenu(menuTree1);
        }
    }

}
