package com.internshala_java;

public class Cake {
    String name;
    float price;

    public void display() {
        System.out.println(name + " : " + " ₹ " + price + " per pound");
    }

    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}
