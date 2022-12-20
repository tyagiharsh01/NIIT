package com.company;

import java.util.Scanner;

public class WhatAPizza {
    public static void main(String[] args) {
        float totalbill;
        double paidAmount;
        boolean istrue = false;
        String name = "Gary";
        long contactNumber = 412312556L;
        String email = "gray@gmail.com";
        String  address = "20,Marble Drive,Eville";
        float pizzaPrice = 12.5f;
        int noOfPizzasOrdered = 5;
        char pizzaSize = 'M';
        int noOfGarlicBreadOrdered = 3;
        float garlicBreadPrice = 5.99f;
        int noOfBeveragesOrdered = 3;
        float beveragePrice = 1.99f;
        float totalPizzaPrice = noOfPizzasOrdered*pizzaPrice;
        float totalGarlicBreadPrice = noOfGarlicBreadOrdered*garlicBreadPrice;
        float totalbeveragesPrice = noOfBeveragesOrdered*beveragePrice;
         totalbill = totalbeveragesPrice+totalPizzaPrice+totalGarlicBreadPrice;
         if(totalbeveragesPrice>=100){
             istrue = true;
             paidAmount = totalbill;
         }
         else {
             istrue = false;
             int disscount = 10;
             paidAmount = totalbill - (totalbill * (disscount / 100.0));
         }
        System.out.println("---------------------------");
        System.out.println("   Customer Details   ");
        System.out.println("---------------------------");
        System.out.println("Customer Name: "+name);
        System.out.println("Customer Phone Number: "+contactNumber);
        System.out.println("Customer address: "+address);
        System.out.println();
        System.out.println("------------------------");
        System.out.println("Order Summary.");
        System.out.println("------------------------");
        System.out.println();
        System.out.println("Sr no.   ItemName      $Price/Unit   $TotalPrice");
        System.out.println("------------------------------------------------");
        System.out.println("1        Pizza          "+pizzaPrice+"          "+totalPizzaPrice);
        System.out.println("2        GarlicBread    "+garlicBreadPrice+"          "+totalGarlicBreadPrice);
        System.out.println("3        Beverage       "+beveragePrice+"          "+totalbeveragesPrice);
        System.out.println("------------------------------------------------");
        System.out.println("Total Bill Amount: $"+totalbill);
        System.out.println("Discount Offered : "+10+"%");
        System.out.println("Amount to be paid: $"+paidAmount);
        System.out.println("------------Thank you---------------------------");
        int ni =1111;
        if(ni >=100){
            System.out.println("number is three digits");
        }
        else if (ni>=10){
            System.out.println("number is two digits");
        }


    }
}
