package com.luban.controller;


import com.luban.feginClientService.AdminFeginService;
import com.luban.util.CookieUtil;
import com.luban.util.R;
import com.luban.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
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
     RedisUtil redisUtil;

    @Autowired
    AdminFeginService adminFeginService;


    @RequestMapping("/login")
    public  Object login(String username,String password,HttpServletRequest request,HttpServletResponse response){
        Map<String,Object> map = new HashMap<>();
        if (StringUtils.isEmpty(username)){
            return R.error("用户名不能为空");
        }
        if (StringUtils.isEmpty(password)){
            return R.error("密码不能为空");
        }
        R user = adminFeginService.getUser(username);
        if (user==null){
            return R.error("用户不存在");
        }
        Map<String,String> mapUser = (Map<String,String>)user.get(R.DATA_KEY);
        String userPassword = mapUser.get("password");
        if (!password.equals(userPassword)){
            return R.error("密码不正确");
        }
        String s = CookieUtil.serLoginCookie(request, response);
        redisUtil.set(s,mapUser);
//        request.getSession().setAttribute(USER_KEY,map);
        return R.success();
    }


    @RequestMapping("/register")
    public  Object register(String username,String password,HttpServletRequest request,HttpServletResponse response){
        if (StringUtils.isEmpty(username)){
            return R.error("用户名不能为空");
        }
        if (StringUtils.isEmpty(password)){
            return R.error("密码不能为空");
        }

        return adminFeginService.register(username, password);
    }

}
