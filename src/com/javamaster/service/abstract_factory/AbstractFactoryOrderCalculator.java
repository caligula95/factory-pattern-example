package com.javamaster.service.abstract_factory;

import com.javamaster.model.OrderRequest;
import com.javamaster.service.OrderCalculator;
import com.javamaster.service.delivery.DeliveryService;

public class AbstractFactoryOrderCalculator implements OrderCalculator {

    private DeliveryFactory deliveryFactory;
    private DeliveryService deliveryService;

    public AbstractFactoryOrderCalculator(DeliveryFactory deliveryFactory) {
        this.deliveryFactory = deliveryFactory;
    }

    @Override
    public Integer calculateTotalOrderPrice(OrderRequest request) {
        deliveryService = deliveryFactory.getDeliveryService(request.getCountry());
        return request.getPrice() + deliveryService.getDeliveryPrice();
    }
}
