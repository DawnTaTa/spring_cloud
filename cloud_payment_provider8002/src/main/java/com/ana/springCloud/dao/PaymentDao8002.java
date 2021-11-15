package com.ana.springCloud.dao;

import com.ana.springCloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao8002 {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
