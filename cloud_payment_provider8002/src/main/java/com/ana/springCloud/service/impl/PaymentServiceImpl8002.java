package com.ana.springCloud.service.impl;

import com.ana.springCloud.dao.PaymentDao8002;
import com.ana.springCloud.entities.Payment;
import com.ana.springCloud.service.PaymentService8002;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl8002 implements PaymentService8002 {

    @Resource
    private PaymentDao8002 paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById( Long id){

        return paymentDao.getPaymentById(id);

    }

}
