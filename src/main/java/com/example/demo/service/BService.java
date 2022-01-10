package com.example.demo.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.BMapper;
import com.example.demo.entity.B;
@Service
public class BService extends ServiceImpl<BMapper, B> {

}
