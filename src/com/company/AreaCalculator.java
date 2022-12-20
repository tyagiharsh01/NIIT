package com.company;

import java.util.Scanner;

public class AreaCalculator {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch(n){
                case 1:
                    double side = sc.nextDouble();
                    double square_area = side*side;
                    System.out.println("Area of square fence for chickens is :"+square_area);
                    break;
                case 2:
                    double radius = sc.nextDouble();
                    double cricle_area = 3.14*radius*radius;
                    System.out.println("Area of circular fence for ducks is :"+cricle_area);
                    break;
                case 3:
                    double length = sc.nextDouble();
                    double breath = sc.nextDouble();
                    double rectangle_area = length*breath;
                    System.out.println("Area of rectangular fence for cows is :"+rectangle_area);
                    break;
                default :
                    System.out.println("Please provide a number between 1 to 3");
                    break;



            }
        }
    }

