package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName(value = "`user`")
public class User {
    public static final String COL_AVATAR_URL = "avatar_url";
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    @TableField(value = "`name`")
    private String name;

    @TableField(value = "`password`")
    private String password;

    @TableField(value = "avatar")
    private String avatar;

    @TableField(value = "subtitle")
    private String subtitle;

    @TableField(value = "fans")
    private Integer fans;

    @TableField(value = "focus")
    private Integer focus;

    @TableField(value = "`like`")
    private Integer like;

    @TableField(value = "video_num")
    private Integer videoNum;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_AVATAR = "avatar";

    public static final String COL_SUBTITLE = "subtitle";

    public static final String COL_FANS = "fans";

    public static final String COL_FOCUS = "focus";

    public static final String COL_LIKE = "like";

    public static final String COL_VIDEO_NUM = "video_num";
}
