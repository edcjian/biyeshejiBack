package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName(value = "video")
public class Video {
    @TableField(value = "id")
    private String id;

    @TableField(value = "`name`")
    private String name;

    @TableField(value = "ssdl")
    private String ssdl;

    @TableField(value = "`time`")
    private Date time;

    @TableField(value = "qy")
    private String qy;

    @TableField(value = "beizhu")
    private String beizhu;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_SSDL = "ssdl";

    public static final String COL_TIME = "time";

    public static final String COL_QY = "qy";

    public static final String COL_BEIZHU = "beizhu";
}