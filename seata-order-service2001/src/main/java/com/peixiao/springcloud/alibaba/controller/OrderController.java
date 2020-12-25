package com.peixiao.springcloud.alibaba.controller;

import com.peixiao.springcloud.alibaba.domain.CommonResult;
import com.peixiao.springcloud.alibaba.domain.Order;
import com.peixiao.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Peixiao Zhao
 * @date 2020-12-25 9:03
 */
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    /**
     * 测试链接
     * http://localhost:2001/order/create?userId=1&productId=1&count=10&money=100
     *
     * @param order
     * @return
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建完成", order);
    }


}
