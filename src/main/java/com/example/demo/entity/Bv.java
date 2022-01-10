package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName(value = "bv")
public class Bv {
    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    @TableField(value = "title")
    private String title;

    @TableField(value = "play")
    private String play;

    @TableField(value = "`comment`")
    private String comment;

    @TableField(value = "`time`")
    private Integer time;

    @TableField(value = "up_id")
    private String upId;

    @TableField(value = "cover")
    private String cover;

    @TableField(value = "recommend")
    private Integer recommend;

    @TableField(value = "`collect`")
    private Integer collect;

    @TableField(value = "`share`")
    private Integer share;

    @TableField(value = "tag")
    private String tag;

    @TableField(value = "`location`")
    private String location;

    @TableField(value = "`dynamic`")
    private String dynamic;

    @TableField(value = "types")
    private String types;

    @TableField(value = "`partition`")
    private String partition;

    public static final String COL_ID = "id";

    public static final String COL_TITLE = "title";

    public static final String COL_PLAY = "play";

    public static final String COL_COMMENT = "comment";

    public static final String COL_TIME = "time";

    public static final String COL_UP_ID = "up_id";

    public static final String COL_INTRO = "intro";

    public static final String COL_COVER = "cover";

    public static final String COL_RECOMMEND = "recommend";

    public static final String COL_COLLECT = "collect";

    public static final String COL_SHARE = "share";

    public static final String COL_TAG = "tag";

    public static final String COL_LOCATION = "location";

    public static final String COL_DYNAMIC = "dynamic";

    public static final String COL_TYPES = "types";

    public static final String COL_PARTITION = "partition";
    @TableField(exist = false)
    private User users;
}
