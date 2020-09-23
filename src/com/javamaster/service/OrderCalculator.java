package com.javamaster.service;

import com.javamaster.model.OrderRequest;

public interface OrderCalculator {

    Integer calculateTotalOrderPrice(OrderRequest request);
}
