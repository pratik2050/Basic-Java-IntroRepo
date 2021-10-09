package com.firstjava;

import java.util.Scanner;

public class new2 {
    public static void main (String[] args) {
        System.out.println("enter your rows and columns:");
        Scanner sc = new Scanner(System.in);                            /* Hollow Rectangle */
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j<=b; j++) {
                if (i==1 || j==1 || i == a || j==b) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
