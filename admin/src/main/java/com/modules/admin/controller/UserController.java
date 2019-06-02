package com.modules.admin.controller;


import com.modules.admin.service.IUserService;
import com.modules.admin.service.impl.UserServiceImpl;
import com.modules.admin.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
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
@RequestMapping("/user")
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping("/getUser")
    public  Object login(@RequestParam Map<String,Object> map){
        return userService.getUser(map);
    }

    @RequestMapping("/getAllUser")
    public  Object getAllUser(@RequestParam Map<String,Object> map,int page,int limit){
        return userService.getUserPage(page,limit,map);
    }

    @RequestMapping("/register")
    public Object register(String username,String password){

        return userService.register(username,password);
    }
}
