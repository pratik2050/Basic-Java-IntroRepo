package com.firstjava;

import java.util.*;

public class new1 {
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);             /* Multiplication Table */
        int x = sc.nextInt();
        for (int n = 1; n<=10;n++) {
            System.out.println(x + "x" + n + "=" + n*x);
        }
    }
}
