package com.javamaster.service.simple_factory;

import com.javamaster.model.OrderRequest;
import com.javamaster.service.OrderCalculator;
import com.javamaster.service.delivery.CanadaDeliveryService;
import com.javamaster.service.delivery.DeliveryService;
import com.javamaster.service.delivery.UsDeliveryService;

public class SimpleFactoryOrderCalculator implements OrderCalculator {
    @Override
    public Integer calculateTotalOrderPrice(OrderRequest request) {
        Integer deliveryPrice = getDeliveryService(request.getCountry()).getDeliveryPrice();
        return request.getPrice() + deliveryPrice;
    }

    private DeliveryService getDeliveryService(String country) {
        if (country.equals("CA")) {
            return new CanadaDeliveryService();
        } else if (country.equals("US")) {
            return new UsDeliveryService();
        }
        return null;
    }
}
