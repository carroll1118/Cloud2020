package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Auther Carroll
 * @Date 2020/3/25
 * @e-mail ggq_carroll@163.com
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
