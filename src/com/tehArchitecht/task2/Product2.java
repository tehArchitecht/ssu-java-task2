package com.tehArchitecht.task2;

public class Product2 {
    private String name;
    private double price;
    private String manufacturer;

    public Product2() {
        name = "";
        price = 0.0;
        manufacturer = "";
    }

    public Product2(String name, double price, String manufacturer) {
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public double priceInDollars() {
        final double rate = 0.016;
        return price*rate;
    }

    @Override
    public String toString() {
        return "Product2{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
