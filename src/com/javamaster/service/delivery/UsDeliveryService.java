package com.javamaster.service.delivery;

public class UsDeliveryService implements DeliveryService {
    @Override
    public Integer getDeliveryPrice() {
        System.out.println("Us delivery...");
        return 15;
    }
}
