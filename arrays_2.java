package com.firstjava;

import java.util.Scanner;

public class arrays_2 {
    public static void main (String[] args) {
        System.out.print("Enter rows: ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] num = new int[r][c];

        for (int i = 0; i<r; i++) {                     // Searching an element from array
            for (int j =0; j<c; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        int[][] numt = new int[c][r];

        for (int i = 0; i<r; i++) {
            for (int j =0; j<c; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.print("Enter element to search: ");

        int x = sc.nextInt();

        for (int i = 0; i<r; i++) {
            for (int j =0; j<c; j++) {
                if (num[i][j] == x) {
                    System.out.println("Position of the point is " + i + "," + j);
                }
            }
        }

        System.out.println("The transpose matrix is");

        for (int i = 0; i<r; i++) {
            for (int j =0; j<c; j++) {
                numt[j][i] = num[i][j];
            }
        }                                                   // Transpose of matrix

        for (int i = 0; i<c; i++) {
            for (int j =0; j<r; j++) {
                System.out.print(numt[i][j] + " ");
            }
            System.out.println();
        }
    }
}
