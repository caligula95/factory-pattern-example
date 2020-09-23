package com.javamaster.service.factory;

import com.javamaster.model.OrderRequest;
import com.javamaster.service.OrderCalculator;
import com.javamaster.service.delivery.DeliveryService;

public abstract class FactoryOrderCalculator implements OrderCalculator {
    @Override
    public Integer calculateTotalOrderPrice(OrderRequest request) {
        return request.getPrice() + getDeliveryService(request.getCountry()).getDeliveryPrice();
    }

    public abstract DeliveryService getDeliveryService(String country);
}
