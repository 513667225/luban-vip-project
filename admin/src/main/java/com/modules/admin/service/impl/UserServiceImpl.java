package com.modules.admin.service.impl;

import com.modules.admin.entity.User;
import com.modules.admin.mapper.UserMapper;
import com.modules.admin.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.modules.admin.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public R getUser(Map<String,Object> map) {
        List<User> users = userMapper.selectByMap(map);
        if (users.size()>0){
            return R.success("success",users.get(0));
        }
        return R.success("success",null);
    }
}
