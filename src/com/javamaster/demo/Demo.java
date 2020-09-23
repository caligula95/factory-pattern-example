package com.javamaster.demo;

import com.javamaster.model.OrderRequest;
import com.javamaster.service.OrderCalculator;
import com.javamaster.service.abstract_factory.AbstractFactoryOrderCalculator;
import com.javamaster.service.abstract_factory.DefaultDeliveryFactory;
import com.javamaster.service.abstract_factory.PromoDeliveryFactory;
import com.javamaster.service.factory.DefaultFactoryOrderCalculator;
import com.javamaster.service.factory.PromoFactoryOrderCalculator;
import com.javamaster.service.simple_factory.SimpleFactoryOrderCalculator;
import com.javamaster.service.withou_factory.WithoutFactoryOrderCalculator;

public class Demo {
    public static void main(String[] args) {
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.setPrice(50);
        orderRequest.setCountry("US");

        OrderCalculator orderCalculator = new WithoutFactoryOrderCalculator();
        System.out.println(orderCalculator.calculateTotalOrderPrice(orderRequest));

        orderCalculator = new SimpleFactoryOrderCalculator();
        System.out.println(orderCalculator.calculateTotalOrderPrice(orderRequest));

        orderCalculator = new PromoFactoryOrderCalculator();
        System.out.println(orderCalculator.calculateTotalOrderPrice(orderRequest));

        orderCalculator = new DefaultFactoryOrderCalculator();
        System.out.println(orderCalculator.calculateTotalOrderPrice(orderRequest));

        orderCalculator = new AbstractFactoryOrderCalculator(new PromoDeliveryFactory());
        System.out.println(orderCalculator.calculateTotalOrderPrice(orderRequest));

        orderCalculator = new AbstractFactoryOrderCalculator(new DefaultDeliveryFactory());
        System.out.println(orderCalculator.calculateTotalOrderPrice(orderRequest));
    }
}
