package com.example.demo;

import com.example.demo.entity.Comment;
import com.example.demo.mapper.CommentMapper;
import com.example.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Resource
    UserMapper userMapper;
    @Resource
    CommentMapper commentMapper;

    @Test
    void contextLoads() {
        List<Comment> list = commentMapper.getComment(1);
        System.out.println(list);
    }
}
