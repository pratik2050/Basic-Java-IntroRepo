package com.internshala_java;

public class Pastry extends Cake {
    @Override
    public void display() {
        System.out.println(name + " : " + " ₹ " + price + " per pound");
    }
}
