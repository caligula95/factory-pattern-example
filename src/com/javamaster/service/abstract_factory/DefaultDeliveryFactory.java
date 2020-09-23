package com.javamaster.service.abstract_factory;

import com.javamaster.service.delivery.CanadaDeliveryService;
import com.javamaster.service.delivery.DeliveryService;
import com.javamaster.service.delivery.UsDeliveryService;

public class DefaultDeliveryFactory implements DeliveryFactory {
    @Override
    public DeliveryService getDeliveryService(String country) {
        if (country.equals("CA")) {
            return new CanadaDeliveryService();
        } else if (country.equals("US")) {
            return new UsDeliveryService();
        }
        return null;
    }
}
