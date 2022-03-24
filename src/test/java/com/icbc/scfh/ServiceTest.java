package com.icbc.scfh;

import com.icbc.scfh.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class ServiceTest {
    @Resource
    UserService userService;

    @Test
    public void testCount(){

        int count = userService.count();
        System.out.println(count);
    }

}
