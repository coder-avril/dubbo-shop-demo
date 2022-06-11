package com.lding.oa.service;

import com.lding.oa.domain.Order;

public interface IOrderService {
    public Order save(Long userId, Long productId);
}
