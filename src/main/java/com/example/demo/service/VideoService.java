package com.example.demo.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.VideoMapper;
import com.example.demo.entity.Video;
@Service
public class VideoService extends ServiceImpl<VideoMapper, Video> {

}
