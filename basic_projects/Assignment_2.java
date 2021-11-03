package com.internshala_java;

import java.util.Scanner;                       // This assignments is of a simple income tax calculator

public class Assignment_2 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of person: ");
        int x = sc.nextInt();
        String[] arr1 = new String[x];
        long[] arr2 = new long[x];                                          //By Pratik Das

        for (int i = 0; i<x; i++) {
            System.out.println("Enter name " + (i+1) + ": ");
            arr1[i] = sc.next();
            System.out.println("Enter " + arr1[i] + "'s Annual Income: ");
            arr2[i] = sc.nextLong();
        }
        System.out.println();
        System.out.println("Names with liable TAX");
        System.out.println("-----------------------------------------------");
        for (int i = 0; i<x; i++) {
            System.out.print(arr1[i] + ": ₹ ");
            calculateTax(arr2[i]);
        }
    }

    public static void calculateTax (long x){
        if (x >= 300000) {
            System.out.println(0.2 * x);
        }
        else if (x >= 100000 && x < 300000){
            System.out.println(0.1 * x);
        }
        else {
            System.out.println("0");
        }
    }
}
