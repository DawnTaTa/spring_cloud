package com.ana.springCloud.controller;

import com.ana.springCloud.entities.CommonResult;
import com.ana.springCloud.entities.Payment;
import com.ana.springCloud.service.PaymentService8002;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController8002 {

    @Resource
    private PaymentService8002 paymentService;

    @Resource
    private DiscoveryClient discoveryClient;

    @Value("${server.port}")
    private String serverPost;

    @PostMapping(value = "/create")
    public CommonResult creat(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.info("*****插入结果："+result);
        if (result>0){  //成功
            return new CommonResult(200,"插入数据库成功，访问端口："+serverPost,result);
        }else {
            return new CommonResult(444,"插入数据库失败",null);
        }

    }

    @GetMapping(value = "/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果："+payment);
        if (payment!=null){  //说明有数据，能查询成功
            return new CommonResult(200,"查询成功，访问端口："+serverPost,payment);
        }else {
            return new CommonResult(444,"没有对应记录，查询ID："+id,null);
        }
    }

    @GetMapping("/payment/discovery")
    public Object getDiscoverys(){
        List<String> services = discoveryClient.getServices();
        for (String service : services) {
            log.info("服务发现："+service);
        }
        List<ServiceInstance> instances = discoveryClient.getInstances("cloud-payment-service");
        for (ServiceInstance instance : instances) {
            log.info("服务实例id："+instance.getServiceId()+"\t"+"服务实例Host："+instance.getHost()+"\t"+"服务实例Port"+instance.getPort()+"\t"+"服务地址"+instance.getUri());
        }
        return discoveryClient;
    }

}
