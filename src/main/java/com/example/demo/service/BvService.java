package com.example.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Bv;
import com.example.demo.mapper.BvMapper;

@Service
public class BvService extends ServiceImpl<BvMapper, Bv> {
    @Resource
    UserMapper userMapper;
    @Resource
    BvMapper bvMapper;

    public List<Bv> findList() {
        List<Bv> lists = this.list();
        List<String> ids = lists.stream().map(Bv::getUpId).collect(Collectors.toList());
        List<User> users = userMapper.selectBatchIds(ids);
        users.forEach(it -> lists.forEach(a -> a.setUsers(it)));
        return lists;


    }


}






