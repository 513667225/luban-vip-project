package com.modules.admin.controller;


import com.modules.admin.service.IMenuService;
import com.modules.admin.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2019-05-23
 */
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    IMenuService menuService;
    @RequestMapping("/getMenu")
    public R getMenu(){

        return menuService.getMenu();
    }


    @RequestMapping("/getOrder")
    public R getOrder(@RequestParam Map<String,Object> map){

        return menuService.getOrder(map);
    }



}
