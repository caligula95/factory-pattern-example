package com.javamaster.service.abstract_factory;

import com.javamaster.service.delivery.DeliveryService;

public interface DeliveryFactory {

    DeliveryService getDeliveryService(String country);
}
