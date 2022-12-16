package com.company;

public class AnnualBalance {
    public static void main(String[] args){
        double balance = 783489.987;
        double interestRate = 15.23;
        double interest = balance * (interestRate/1200);
        System.out.println("Interest: "+interest);
    }
}
