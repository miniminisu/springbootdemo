package com.icbc.scfh.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.icbc.scfh.entity.User;
import com.icbc.scfh.mapper.UserMapper;

public interface UserService extends IService<User> {
    // 继承了Iservice后，UserService就有了其自带的常见的业务处理方法
    // 这里泛型要传递实体类，而不是mapper类
}
