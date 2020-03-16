package com.majingji.pervue.entity;

import lombok.Data;

import java.util.List;

@Data
public class DistrictVo extends District{
    private Integer value;
    private String label;
    private List<DistrictVo> children;
}
