package com.booleanuk.core;

public class Book implements Items{
    String name;
    int price;


    public Book(String name, int price) {
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
