package com.ana.springcloud.myhandler;


import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.ana.springCloud.entities.CommonResult;

public class CustomerBlockHandler {

    public static CommonResult handleException(BlockException exception){
        return  new CommonResult(4444,"自定义的限流处理信息。。。。CustomerBlockHandler");
    }

    public static CommonResult handleException2(BlockException exception){
        return  new CommonResult(4444,"自定义的限流处理信息2。。。。CustomerBlockHandler--2");
    }

}
