package com.ana.springCloud.service;

import com.ana.springCloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService8002 {

    public int create(Payment payment); //写

    public Payment getPaymentById(@Param("id") Long id);  //读取

}
