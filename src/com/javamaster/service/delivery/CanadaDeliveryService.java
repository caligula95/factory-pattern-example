package com.javamaster.service.delivery;

public class CanadaDeliveryService implements DeliveryService {

    @Override
    public Integer getDeliveryPrice() {
        System.out.println("Canada delivery factory...");
        return 10;
    }
}
