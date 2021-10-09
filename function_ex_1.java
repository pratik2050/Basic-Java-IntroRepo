package com.firstjava;

import java.util.Scanner;

public class function_ex_1 {

    // Sum of all odd numbers
    public static void sodd(int n) {
        int sum = 0;
        for (int i = 1; i<n; i++) {
            if (i%2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        System.out.println("enter n");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        sodd(x);
    }
}
