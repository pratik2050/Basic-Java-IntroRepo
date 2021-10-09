package com.firstjava;

import java.util.Scanner;

public class advance_patterns {
    public static void main (String[] args) {
        System.out.println("Enter n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j = 1; j<=i;j++) {
                System.out.print("*");                          // BUTTERFLY PATTERN
            }

            int spaces = 2 * (n-i);
            for (int j=1; j<=spaces;j++) {
                System.out.print(" ");
            }

            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i=n; i>=1; i--) {
            for (int j = 1; j<=i;j++) {
                System.out.print("*");
            }

            int spaces = 2 * (n-i);
            for (int j=1; j<=spaces;j++) {
                System.out.print(" ");
            }

            for (int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 1; i<=n;i++) {
            for (int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
                                                                    // SOLID RHOMBUS
            for (int j = 1; j<=n;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i<=n;i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1;j<=i;j++) {                          // NUMBER PYRAMID
                System.out.print(i + " ");
            }
            System.out.println();
        }


        for (int i = 1; i<=n;i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j=i; j>=1;j--) {
                System.out.print(j);                                // Palindromic Pyramid
            }
            for (int j = 2; j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = 1; i<=n;i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<=2*i-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i>=1;i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");                              //Diamond Pattern
            }
            for (int j = 1; j<=2*i-1;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
