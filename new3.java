package com.firstjava;

import java.util.Scanner;           // Pyramid Problems

public class new3 {
    public static void main (String[] args) {
        // Half Pyramid
        System.out.println("Enter number of rows:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i<=a; i++) {
            for (int j =1; j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // inverted half pyramid

        for (int i = a; i>=1; i--) {
            for (int j = i; j>=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // half pyramid right side

        for (int i = 1; i<=a; i++) {
            for (int j = 1; j<=a-i; j++) {
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // number half pyramid
        System.out.println();

        for (int i = 1; i<=a; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // inverted number half pyramid

        System.out.println();

        for (int i = a; i>=1; i--) {
            for (int j = 1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        // Floyd's Triangle

        int x = 1;
        for (int i = 1; i<=a; i++) {
            for (int j =1; j<=i;j++) {
                System.out.print(x + " ");
                x++;
            }
            System.out.println();
        }

        // Binary triangle

        System.out.println();

        for (int i = 1; i<=a; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
