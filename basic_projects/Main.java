package com.internshala_java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");                //By Pratik Das
        String x = sc.nextLine();
        System.out.println("Enter Age: ");
        int y = sc.nextInt();
        System.out.println("Enter blood Group: ");
        sc.nextLine();                                      //this line is used to consume the backslack when a user press enter
        String z = sc.nextLine();
        sc.close();
        System.out.println("--------------------------------------------");
        System.out.println("Name: " + x);
        System.out.println("Age: " + y);
        System.out.println("Blood Group: " + z);
        System.out.println("--------------------------------------------");
        
        if (y >= 20) {
            System.out.println("  Your Group is Red");
            System.out.println("--------------------------------------------");
        } else if (y>=15 && y<20) {
            System.out.println("  Your Group is Blue");
            System.out.println("--------------------------------------------");
        }else {
            System.out.println("  Your Group is Yellow");
            System.out.println("--------------------------------------------");
        }
    }
}
