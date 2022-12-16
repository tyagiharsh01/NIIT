package com.company;

public class AnnualBalance {
    public static void main(String[] args){
        double balance = 1000;
        double interestRate = 3.5;
        double interest = balance * (interestRate/1200);
        System.out.println("Interest: "+interest);
    }
}
