package com.icbc.scfh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.icbc.scfh.entity.User;

import java.util.List;

public interface UserMapper extends BaseMapper<User> {

    //自定义方法
    List<User> selectAllByName(String name); // 方法的实现要通过resources/mapper/UserMapper.xml文件来实现
}
