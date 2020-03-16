package com.majingji.pervue.entity;

import lombok.Data;

@Data
public class GoodsVo extends Goods {
    private String provinceName;
    private String cityName;
    private String districtName;
    private String sids;
    private String snames;
    private String remarks;
    private Double p1;
    private Double p2;
}
