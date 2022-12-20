package com.company;

import java.util.Scanner;

public class wat_a_pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String email = sc.nextLine();
        long contactNumber = sc.nextLong();
        sc.nextLine();
        String  address = sc.nextLine();
        System.out.println(address);

        float pizzaPrice = 12.99f;
        float garlicBreadPrice = 5.99f;
        float beveragePrice = 1.99f;
        //	System.out.println("Enter 1 for Pizza, 2 for Garlic Bread and 3 for Beverages");
        int n = sc.nextInt();
        switch(n){
            case 1 :
                int noOfPizzasOrdered = sc.nextInt();
                float totalPizzaPrice = noOfPizzasOrdered*pizzaPrice;
                System.out.println("Your total Pizza bill : $ "+totalPizzaPrice);
                break;
            case 2:
                int noOfGarlicBreadOrdered  = sc.nextInt();
                float totalGarlicBreadPrice = noOfGarlicBreadOrdered*garlicBreadPrice;
                System.out.println("Your total Garlic Bread Bill : $ "+totalGarlicBreadPrice);
                break;
            case 3:
                int noOfBeveragesOrdered = sc.nextInt();
                float totalbeveragesPrice = noOfBeveragesOrdered*beveragePrice;
                System.out.println("Your total Beverage Bill : $ "+totalbeveragesPrice);
                break;
            default:
                System.out.println("Please provide a valid input");
                break;

        }
    }
    }

