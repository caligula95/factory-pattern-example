package com.javamaster.model;

public class OrderRequest {

    private String country;
    private Integer price;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "country='" + country + '\'' +
                ", price=" + price +
                '}';
    }
}
