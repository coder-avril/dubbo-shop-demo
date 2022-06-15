package com.lding.os.service.impl;

import com.lding.oa.domain.Order;
import com.lding.oa.service.IOrderService;
import com.lding.pa.domain.Product;
import com.lding.pa.service.IProductService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.UUID;

@Service
public class OrderServiceImpl implements IOrderService {
    @Reference(mock = "com.lding.os.service.impl.ProductServiceImpl")
    private IProductService productService;

    @Override
    public Order save(Long userId, Long productId) {
        //远程获取
        Product product = productService.get(productId);
        Order order = new Order();
        order.setOrderNo(UUID.randomUUID().toString().replace("-", ""));
        order.setCreateTime(new Date());
        order.setUserId(userId);
        order.setProductName(product.getName());
        order.setProductPrice(product.getPrice());
        System.out.println("执行保存订单操作");
        return order;
    }
}
