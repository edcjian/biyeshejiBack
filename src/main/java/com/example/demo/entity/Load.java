package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@TableName(value = "`a`")
public class Load {
    @TableField(value = "id")
    private String id;

    @TableField(value = "dlxx_sszd")
    private String sszd;

    @TableField(value = "dlxx_dlsx")
    private String dlsx;

    @TableField(value = "dlxx_level")
    private String level;

    @TableField(value = "dlxx_length")
    private String length;

    @TableField(value = "dlxx_hjmkd")
    private String hjmkd;

    @TableField(value = "dlxx_jmbz")
    private String jmbz;

    @TableField(value = "dlxx_hdmjg")
    private String hdmjg;

    @TableField(value = "dlxx_hdmbz")
    private String hdmbz;

    @TableField(value = "dlxx_edfb")
    private String edfb;

    @TableField(value = "dlxx_cdfbbz")
    private String cdfbbz;

    @TableField(value = "dlxx_sjsd")
    private String sjsd;

    @TableField(value = "dxx_fx")
    private String fx;

    @TableField(value = "dlxx_dlqd")
    private String dlqd;

    @TableField(value = "dlxx_dlzd")
    private String dlzd;

    @TableField(value = "dlxx_xhdsl")
    private String xhdsl;

    @TableField(value = "dlxx_rxhdsl")
    private String rxhdsl;

    @TableField(value = "dlxx_jzwcrksl")
    private String jzwcrksl;

    @TableField(value = "dlxx_bzpsl")
    private String bzpsl;

    @TableField(value = "dlxx_jszsl")
    private String jszsl;

    @TableField(value = "dlxx_tqlbsl")
    private String tqlbsl;

    @TableField(value = "dlxx_bsdsl")
    private String bsdsl;

    @TableField(value = "dlxx_aqzsl")
    private String aqzsl;

    @TableField(value = "dlxx_lsydbzsl")
    private String lsydbzsl;

    @TableField(value = "dlxx_blr")
    private String blr;

    @TableField(value = "dlxx_sjsdbz")
    private String sjsdbz;

    @TableField(value = "dlxx_ccybh")
    private String ccybh;

    @TableField(value = "dlxx_beizhu")
    private String beizhu;

    public static final String COL_ID = "id";

    public static final String COL_DLXX_SSZD = "dlxx_sszd";

    public static final String COL_DLXX_DLSX = "dlxx_dlsx";

    public static final String COL_DLXX_LEVEL = "dlxx_level";

    public static final String COL_DLXX_LENGTH = "dlxx_length";

    public static final String COL_DLXX_HJMKD = "dlxx_hjmkd";

    public static final String COL_DLXX_JMBZ = "dlxx_jmbz";

    public static final String COL_DLXX_HDMJG = "dlxx_hdmjg";

    public static final String COL_DLXX_HDMBZ = "dlxx_hdmbz";

    public static final String COL_DLXX_EDFB = "dlxx_edfb";

    public static final String COL_DLXX_CDFBBZ = "dlxx_cdfbbz";

    public static final String COL_DLXX_SJSD = "dlxx_sjsd";

    public static final String COL_DXX_FX = "dxx_fx";

    public static final String COL_DLXX_DLQD = "dlxx_dlqd";

    public static final String COL_DLXX_DLZD = "dlxx_dlzd";

    public static final String COL_DLXX_XHDSL = "dlxx_xhdsl";

    public static final String COL_DLXX_RXHDSL = "dlxx_rxhdsl";

    public static final String COL_DLXX_JZWCRKSL = "dlxx_jzwcrksl";

    public static final String COL_DLXX_BZPSL = "dlxx_bzpsl";

    public static final String COL_DLXX_JSZSL = "dlxx_jszsl";

    public static final String COL_DLXX_TQLBSL = "dlxx_tqlbsl";

    public static final String COL_DLXX_BSDSL = "dlxx_bsdsl";

    public static final String COL_DLXX_AQZSL = "dlxx_aqzsl";

    public static final String COL_DLXX_LSYDBZSL = "dlxx_lsydbzsl";

    public static final String COL_DLXX_BLR = "dlxx_blr";

    public static final String COL_DLXX_SJSDBZ = "dlxx_sjsdbz";

    public static final String COL_DLXX_CCYBH = "dlxx_ccybh";

    public static final String COL_DLXX_BEIZHU = "dlxx_beizhu";
}