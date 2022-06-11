package com.lding.ps.server.impl;

import com.lding.pa.domain.Product;
import com.lding.pa.service.IProductService;
import com.lding.ps.mapper.ProductMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> list() {
        return productMapper.list();
    }

    @Override
    public Product get(Long id) {
        System.out.println("调用指定服务, 正在写的测试代码");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return productMapper.get(id);
    }
}
