package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName(value = "er")
public class Er {
    @TableField(value = "id")
    private String id;

    @TableField(value = "`name`")
    private String name;

    @TableField(value = "num")
    private String num;

    @TableField(value = "kind")
    private String kind;

    @TableField(value = "bdate")
    private String bdate;

    @TableField(value = "udate")
    private String udate;

    @TableField(value = "resp")
    private String resp;

    @TableField(value = "`use`")
    private String use;

    @TableField(value = "remarks")
    private String remarks;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_NUM = "num";

    public static final String COL_KIND = "kind";

    public static final String COL_BDATE = "bdate";

    public static final String COL_UDATE = "udate";

    public static final String COL_RESP = "resp";

    public static final String COL_USE = "use";

    public static final String COL_REMARKS = "remarks";
}