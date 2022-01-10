package com.example.demo.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.Load;
import com.example.demo.mapper.LoadMapper;

@Service
public class LoadService extends ServiceImpl<LoadMapper, Load> {

}


