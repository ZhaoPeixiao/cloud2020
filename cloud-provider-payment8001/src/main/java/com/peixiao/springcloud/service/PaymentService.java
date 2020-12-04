package com.peixiao.springcloud.service;

import com.peixiao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Peixiao Zhao
 * @date 2020/12/4 20:37
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
