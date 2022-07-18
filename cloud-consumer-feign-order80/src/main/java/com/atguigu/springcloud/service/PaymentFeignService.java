package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id);

    // 不用服务提供者的所有接口，用到哪个写哪个就可以；
    // 但是注解@GetMapping要带着，不然无法启动，这就很奇怪了，相当于通过feign调用服务提供者的controller
    /*@GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();*/
}
