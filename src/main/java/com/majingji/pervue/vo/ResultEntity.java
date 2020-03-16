package com.majingji.pervue.vo;

import lombok.Data;

import javax.xml.transform.Result;
import java.io.Serializable;

@Data
public class ResultEntity implements Serializable {
    //返回说明
    private String reason;
    //返回的数据
    private Object result;
    //返回code状态码
    private Integer code;

    public ResultEntity(){

    }
    public ResultEntity(String reason, Object result, Integer code) {
        this.reason = reason;
        this.result = result;
        this.code = code;
    }

    //成功格式数据
    public static ResultEntity ok(Object result){
        return new ResultEntity("success",result,1000);
    }

    //失败时的格式数据
    public static ResultEntity error(){
        return new ResultEntity("error",null,10001);
    }

    //重载方法
    public static ResultEntity err(String reason,Integer code,Object result){
        return new ResultEntity(reason,result,code);
    }
}
