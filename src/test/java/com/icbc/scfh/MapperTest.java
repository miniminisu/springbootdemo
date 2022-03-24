package com.icbc.scfh;

import com.icbc.scfh.entity.User;
import com.icbc.scfh.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class MapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testUpdate(){
        User user = new User();
        user.setName("sujuntong");
        user.setId(1L);
        user.setAge(26);
        int result = userMapper.updateById(user);
        System.out.println(result);
    }
}
