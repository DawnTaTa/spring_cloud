package com.ana.springCloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {

    //添加备注
    //404 not_found
    private Integer code;
    private String message;
    private T date;

    public CommonResult(Integer code, String message){
        this(code,message,null);
    }

}
