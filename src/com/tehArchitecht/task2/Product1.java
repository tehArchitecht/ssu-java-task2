package com.tehArchitecht.task2;

import java.time.Year;

public class Product1 {
    private String name;
    private double price;
    private long releaseYear;

    public Product1() {
        name = "";
        price = 0.0;
        releaseYear = 0;
    }

    public Product1(String name, double price, long releaseYear) {
        this.name = name;
        this.price = price;
        this.releaseYear = releaseYear;
    }

    public long yearsSinceRelease() {
        return Year.now().getValue() - releaseYear;
    }

    public boolean increasePrice() {
        if (Year.now().getValue() == releaseYear) {
            price *= 1.2;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Product1{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
