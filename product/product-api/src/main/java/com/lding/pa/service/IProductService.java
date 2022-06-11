package com.lding.pa.service;

import com.lding.pa.domain.Product;
import java.util.List;

public interface IProductService {
    List<Product> list();
    Product get(Long id);
}
