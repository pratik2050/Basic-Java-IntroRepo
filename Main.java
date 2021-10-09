package com.firstjava;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter your numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter choice");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println(a+b);
                break;
            case 2:
                System.out.println(a-b);
                break;
            case 3:
                System.out.println(a*b);
                break;
            case 4:
                if (b==0) {
                    System.out.println("zero division error");
                }
                else {
                    System.out.println(a/b);
                }
                break;
            case 5:
                if (b==0) {
                    System.out.println("zero division error");
                }
                else {
                    System.out.println(a%b);
                }
                break;
            default:
                System.out.println("invalid response");
        }
    }
}
