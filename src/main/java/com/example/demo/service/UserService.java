package com.example.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.demo.vo.ResponseVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

@Service
public class UserService extends ServiceImpl<UserMapper, User> {
    @Resource
    private UserMapper userMapper;
    User nullUser = new User();

    public UserService() {

        nullUser.setName("cant find");
    }

    public User search(String word) {
        LambdaQueryWrapper<User> wrapper = new LambdaQueryWrapper<User>().like(User::getSubtitle, word);
        User user = userMapper.selectOne(wrapper);
        return user == null ? nullUser : user;


    }

    public ResponseVo<String> register(User user) {
        User u = userMapper.selectOne(new LambdaQueryWrapper<User>().eq(User::getName, user.getName()));
        if (u == null) {
            this.save(user);
            return ResponseVo.success("注册成功");
        }
        return ResponseVo.failed("已经注册");
    }

    public ResponseVo<User> login(User user) {
        ResponseVo<User> vo = new ResponseVo<>();
        User u = userMapper.selectOne(new LambdaQueryWrapper<User>().eq(User::getName, user.getName()).eq(User::getPassword, user.getPassword()));
        vo.setStatusCode(u != null ? "200" : "400");
        if (u != null) {
            vo.setData(u);
        }
        return vo;

    }
}




