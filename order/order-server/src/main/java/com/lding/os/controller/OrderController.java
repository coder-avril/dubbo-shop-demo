package com.lding.os.controller;

import com.lding.oa.domain.Order;
import com.lding.oa.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private IOrderService orderService;

    @RequestMapping("/save")
    public Order save(Long userId, Long productId){
        return orderService.save(userId,productId);
    }
}
