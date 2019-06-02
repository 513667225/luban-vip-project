package com.modules.admin.service;

import com.modules.admin.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.modules.admin.util.R;

import java.util.Map;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 
 * @since 2019-05-23
 */
public interface IUserService extends IService<User> {

    public R getUser(Map<String,Object> map);

    public R register(String username,String password);

    public R getUserPage(int page,int limit,Map<String,Object> map);

}
