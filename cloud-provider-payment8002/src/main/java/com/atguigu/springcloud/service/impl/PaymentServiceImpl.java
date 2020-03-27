package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.dao.PaymentMapper;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther Carroll
 * @Date 2020/3/24
 * @e-mail ggq_carroll@163.com
 */
@Service
public class PaymentServiceImpl implements PaymentService{
    @Resource
    private PaymentMapper paymentMapper;

    public int create(Payment payment){
        return paymentMapper.create(payment);
    }
    public Payment getPaymentById(Long id){
        return paymentMapper.getPaymentById(id);
    }
}
