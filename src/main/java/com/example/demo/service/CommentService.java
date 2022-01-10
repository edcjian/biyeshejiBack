package com.example.demo.service;

import com.example.demo.entity.Comment;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jainyingbiao
 * @since 2021-12-17
 */
public interface CommentService extends IService<Comment> {

    void getComment(Integer id);
}
