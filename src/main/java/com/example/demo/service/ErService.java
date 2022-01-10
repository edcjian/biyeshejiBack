package com.example.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.ErMapper;
import com.example.demo.entity.Er;

@Service
public class ErService extends ServiceImpl<ErMapper, Er> {
    @Resource
    ErMapper erMapper;

    public Er search(String word) {
        LambdaQueryWrapper<Er> wrapper = new LambdaQueryWrapper<Er>().like(Er::getId, word);
        Er user = new Er();
        user = erMapper.selectOne(wrapper);
        return user;
    }
}
