package com.peixiao.springcloud.service.impl;

import com.peixiao.springcloud.dao.PaymentDao;
import com.peixiao.springcloud.entities.Payment;
import com.peixiao.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author Peixiao Zhao
 * @date 2020/12/4 20:38
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
