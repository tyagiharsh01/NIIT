package com.company;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number>90&&number<=100){
            System.out.println("A");
        }
        else if(number>80&&number<=90){
            System.out.println("B");
        }
        else if(number>70&&number<=80){
            System.out.println("C");
        }
        else if(number>60&&number<=70){
            System.out.println("D");
        }
        else if(number>=40&&number<=60)
            System.out.println("E");
        else if(number>=0&&number<40){
            System.out.println("Fail");
        }
        else{
            System.out.println("Please provide a value from 0 to 100");
        }
    }

}
