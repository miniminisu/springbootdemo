package com.icbc.scfh.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.icbc.scfh.entity.User;
import com.icbc.scfh.mapper.UserMapper;
import com.icbc.scfh.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

// 先让UserServiceImpl继承ServiceImpl，同时要传入实体mapper类和实体类
// 再实现自己的UserService里的方法，从而实现特殊的业务逻辑
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    // 先让UserServiceImpl继承ServiceImpl，同时要传入实体mapper类和实体类
    // 再实现自己的UserService里的方法，从而实现特殊的业务逻辑
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> listAllByName(String name) {
        return userMapper.selectAllByName(name);
    }

}
