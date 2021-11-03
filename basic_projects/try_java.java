package com.internshala_java;

class abc {
    int a=2; int b; String c;
    abc() {
        a = 3;
        b = 10;
    }
    void dis() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
public class try_java {
    public static void main(String[] args) {
        abc s = new abc();
        s.dis();
    }
}
