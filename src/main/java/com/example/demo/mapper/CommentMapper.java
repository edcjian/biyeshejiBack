package com.example.demo.mapper;

import com.example.demo.entity.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author jainyingbiao
 * @since 2021-12-17
 */
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {

     List<Comment> getComment(Integer id);
}
