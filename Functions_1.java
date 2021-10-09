package com.firstjava;

import java.util.Scanner;

public class Functions_1 {
    public static void Function(String name) {              ///these are methods not functions
        System.out.println(name);
    }

    public static void Factorialofnum(int a) {
        int k = 1;
        if (a<=0) {
            System.out.println("invalid input");            // Factorial Function
            return;
        }
        for (int i = 1; i<=a; i++) {
            k = k*i;
        }
        System.out.println(k);
    }

    public static void isprime(int x) {
        for (int i = 2; i<x;i++) {
            if (x%i==0) {
                System.out.println("Not prime");            //Function to check primes
                return;
            }
        }
        System.out.println("prime");
    }

    public static void main(String[] args) {
        System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        System.out.println("enter the number to find factorial");
        int y = sc.nextInt();
        System.out.println("enter number to check prime");
        int z = sc.nextInt();

        Function(x);
        Factorialofnum(y);
        isprime(z);
    }
}
