package com.icbc.scfh;

import com.icbc.scfh.entity.User;
import com.icbc.scfh.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest // 自动创建spring上下文环境(可以理解为拥有了spring容器的一切东西)
public class ApplicationStartTest {

    //@Autowired // spring
    @Resource // j2ee
    private UserMapper userMapper;

    @Test
    public void test() {
        System.out.println("这是test类的输出");
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);

    }
}
