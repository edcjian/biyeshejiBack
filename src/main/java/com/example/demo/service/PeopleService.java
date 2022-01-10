package com.example.demo.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.PeopleMapper;
import com.example.demo.entity.People;
@Service
public class PeopleService extends ServiceImpl<PeopleMapper, People> {

}
