package com.atguigu.springcloud.service;

import com.atguigu.springcloud.domain.Order;
import org.springframework.stereotype.Service;

/**
 * @auther zzyy
 * @create 2019-12-11 16:48
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
