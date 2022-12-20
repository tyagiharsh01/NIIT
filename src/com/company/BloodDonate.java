package com.company;

import java.util.Scanner;

public class BloodDonate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the age.");
        int age = sc.nextInt();
        System.out.println("Please enter the weight.");
        int wegiht = sc.nextInt();
        if(age>=18&&age<=45){
            if(wegiht>=50&&wegiht<=75){
                System.out.println("You are eligble to donate the blood.");
            }
        }
        else {
            System.out.println("You are eligble to donate the blood.");
        }

    }
}
