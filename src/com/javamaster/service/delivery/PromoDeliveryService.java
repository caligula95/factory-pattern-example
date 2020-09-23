package com.javamaster.service.delivery;

public class PromoDeliveryService implements DeliveryService {
    @Override
    public Integer getDeliveryPrice() {
        System.out.println("Promo...");
        return 0;
    }
}
