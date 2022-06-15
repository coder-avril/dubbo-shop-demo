package com.lding.os.service.impl;

import com.lding.pa.domain.Product;
import com.lding.pa.service.IProductService;
import java.util.List;

public class ProductServiceImpl implements IProductService {
    @Override
    public List<Product> list() {
        return null;
    }

    @Override
    public Product get(Long id) {
        System.out.println("调用指定服务异常, 使用兜底实现");
        Product product = new Product();
        product.setPrice(100);
        product.setName("兜底数据");
        product.setStock(1);
        return product;
    }
}
