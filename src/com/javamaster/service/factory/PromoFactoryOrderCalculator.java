package com.javamaster.service.factory;

import com.javamaster.service.delivery.DeliveryService;
import com.javamaster.service.delivery.PromoDeliveryService;

public class PromoFactoryOrderCalculator extends FactoryOrderCalculator {
    @Override
    public DeliveryService getDeliveryService(String country) {
        return new PromoDeliveryService();
    }
}
