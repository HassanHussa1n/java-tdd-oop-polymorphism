package com.booleanuk.core;

public class Drink implements Items{
    String name;
    int price;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }

    public void add(Items items) {

    }
}
