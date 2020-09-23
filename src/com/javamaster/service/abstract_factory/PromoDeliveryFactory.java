package com.javamaster.service.abstract_factory;

import com.javamaster.service.delivery.DeliveryService;
import com.javamaster.service.delivery.PromoDeliveryService;

public class PromoDeliveryFactory implements DeliveryFactory {
    @Override
    public DeliveryService getDeliveryService(String country) {
        return new PromoDeliveryService();
    }
}
