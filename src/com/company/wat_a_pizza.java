package com.company;

import java.util.Scanner;

public class wat_a_pizza {
            public static void main(String[] args){
                int choice;
                Scanner sc = new Scanner(System.in);
                String name = sc.nextLine();
                String email = sc.nextLine();
                long contactNumber = sc.nextLong();
                sc.nextLine();
                String  address = sc.nextLine();
                float pizzaPrice = 12.99f;
                float garlicBreadPrice = 5.99f;
                float beveragePrice = 1.99f;
                float total_bill=0;
                //	System.out.println("Enter 1 for Pizza, 2 for Garlic Bread and 3 for Beverages");

                do{
                    int n = sc.nextInt();
                    switch(n){
                        case 1 :
                            int noOfPizzasOrdered = sc.nextInt();
                            float totalPizzaPrice = noOfPizzasOrdered*pizzaPrice;
                            total_bill +=totalPizzaPrice;
                            break;
                        case 2:
                            int noOfGarlicBreadOrdered  = sc.nextInt();
                            float totalGarlicBreadPrice = noOfGarlicBreadOrdered*garlicBreadPrice;
                            total_bill = total_bill+totalGarlicBreadPrice;
                            break;
                        case 3:
                            int noOfBeveragesOrdered = sc.nextInt();
                            float totalbeveragesPrice = noOfBeveragesOrdered*beveragePrice;
                            total_bill = total_bill+totalbeveragesPrice;
                            break;
                        default:
                            System.out.println("Please provide a valid input");
                            break;
                    }
                    choice = sc.nextInt();
                }while(choice==1);
                System.out.println("The total bill amount : $ "+total_bill);
                if(total_bill>50){
                    float discounted_bill = total_bill+(total_bill*10)/100;
                    System.out.println("The total discounted bill amount : $ "+discounted_bill);
                }
                else{
                    System.out.println("No discount provided since bill amount is less than $ 50");
                }



            }
        }




