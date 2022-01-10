package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName(value = "b")
public class People {
    @TableField(value = "rygl_sex")
    private String sex;

    @TableField(value = "rygl_jh")
    private String jh;

    @TableField(value = "rygl_sfxx")
    private String sfxx;

    @TableField(value = "rygl_tele")
    private String tele;

    @TableField(value = "rygl_ch")
    private String ch;

    @TableField(value = "rygl_dh")
    private String dh;

    @TableField(value = "rygl_addr")
    private String addr;

    @TableField(value = "rygl_zwbm")
    private String zwbm;

    @TableField(value = "rygl_type")
    private String type;

    @TableField(value = "rygl_syx")
    private String syx;

    @TableField(value = "rygl_xgsj")
    private String xgsj;

    @TableField(value = "rygl_xzsj")
    private String xzsj;

    @TableField(value = "rygl_scsj")
    private String scsj;

    @TableField(value = "rygl_scbj")
    private String scbj;

    @TableField(value = "rygl_beizhu")
    private String beizhu;

    public static final String COL_RYGL_SEX = "rygl_sex";

    public static final String COL_RYGL_JH = "rygl_jh";

    public static final String COL_RYGL_SFXX = "rygl_sfxx";

    public static final String COL_RYGL_TELE = "rygl_tele";

    public static final String COL_RYGL_CH = "rygl_ch";

    public static final String COL_RYGL_DH = "rygl_dh";

    public static final String COL_RYGL_ADDR = "rygl_addr";

    public static final String COL_RYGL_ZWBM = "rygl_zwbm";

    public static final String COL_RYGL_TYPE = "rygl_type";

    public static final String COL_RYGL_SYX = "rygl_syx";

    public static final String COL_RYGL_XGSJ = "rygl_xgsj";

    public static final String COL_RYGL_XZSJ = "rygl_xzsj";

    public static final String COL_RYGL_SCSJ = "rygl_scsj";

    public static final String COL_RYGL_SCBJ = "rygl_scbj";

    public static final String COL_RYGL_BEIZHU = "rygl_beizhu";
}