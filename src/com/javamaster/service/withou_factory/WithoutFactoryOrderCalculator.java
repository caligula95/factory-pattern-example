package com.javamaster.service.withou_factory;

import com.javamaster.model.OrderRequest;
import com.javamaster.service.OrderCalculator;

public class WithoutFactoryOrderCalculator implements OrderCalculator {
    @Override
    public Integer calculateTotalOrderPrice(OrderRequest request) {
        Integer deliveryPrice = null;
        String country = request.getCountry();
        if (country.equals("CA")) {
            System.out.println("Canada delivery...");
            deliveryPrice = 10;
        } else if (country.equals("US")) {
            System.out.println("Us delivery...");
            deliveryPrice = 15;
        }
        return request.getPrice() + deliveryPrice;
    }
}
