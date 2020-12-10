package com.peixiao.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author Peixiao Zhao
 * @date 2020/12/10 20:12
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {


    @Override
    public String paymentInfo_OK(Integer id) {
        return "----PaymentFallbackService fall back--paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----PaymentFallbackService fall back--paymentInfo_TimeOut";
    }
}
