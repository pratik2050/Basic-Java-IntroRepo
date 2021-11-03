package com.internshala_java;
import java.util.*;

                        /* By Pratik Das */

public class Assignment_3 {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("                 Today's Special Menu");
        System.out.println("-------------------------------------------------------");
        System.out.println();

        //arraylist of cake
        ArrayList<String> cName = new ArrayList<>();
        cName.add("Chocolate Brownie");
        cName.add("Chocolate Maple");

        ArrayList<Float> cPrice = new ArrayList<>();
        cPrice.add(250.0f);
        cPrice.add(300.0f);


        //creating obj of cake
        Cake cake = new Cake();
        cake.setName(cName.get(0));
        cake.setPrice(cPrice.get(0));
        System.out.println("                    Special Cakes");
        System.out.println("-------------------------------------------------------");
        cake.display();
        cake.setName(cName.get(1));
        cake.setPrice(cPrice.get(1));
        cake.display();
        System.out.println();


        //arraylist of pastry
        ArrayList<String> pName = new ArrayList<>();
        pName.add("Black Forest");
        pName.add("Choco Truffle");

        ArrayList<Float> pPrice = new ArrayList<>();
        pPrice.add(35.0f);
        pPrice.add(40.0f);


        //creating obj of pastry
        Pastry pastry = new Pastry();
        pastry.setName(pName.get(0));
        pastry.setPrice(pPrice.get(0));
        System.out.println("                   Special Pastries");
        System.out.println("------------------------------------------------------");
        pastry.display();
        pastry.setName(pName.get(1));
        pastry.setPrice(pPrice.get(1));
        pastry.display();
        System.out.println();
    }
}
