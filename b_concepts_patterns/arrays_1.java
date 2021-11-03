package com.firstjava;

import java.util.Scanner;

public class arrays_1 {
    public static void main (String[] args) {
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int []arr = new int [s];

        for (int i=0; i<s;i++) {
            System.out.print("enter element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter number to search:");
        int x = sc.nextInt();

        for (int i = 0; i<arr.length; i++) {
            if (arr[i]==x) {
                System.out.println("item found at pos= " + i);
                break;
            }
        }
    }
}
