package com.ana.springCloud.service.impl;

import com.ana.springCloud.dao.PaymentDao;
import com.ana.springCloud.entities.Payment;
import com.ana.springCloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById( Long id){

        return paymentDao.getPaymentById(id);

    }

}
