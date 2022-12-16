package com.company;

public class SellingPrice {
    public static void main(String[] args) {

        String itemName = "kaisa bowl";
        double selling_price = 10.99;
        selling_price = selling_price+(selling_price*(5.0/100));
        System.out.println("After increasing the newprice will become: "+selling_price);

    }
}
