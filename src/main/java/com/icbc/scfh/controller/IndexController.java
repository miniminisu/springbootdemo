package com.icbc.scfh.controller;

import com.icbc.scfh.entity.User;
import com.icbc.scfh.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired // j2ee
    private UserMapper userMapper;

    @RequestMapping("/index")
    public String index() {
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
        return "this is index controller";
    }
}