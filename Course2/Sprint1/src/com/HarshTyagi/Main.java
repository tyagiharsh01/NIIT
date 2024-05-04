package com.HarshTyagi;

import java.util.ArrayList;
import  java.util.Scanner;

public class Main {
   public static int highestValue(int[] arr){
       int highest = Integer.MIN_VALUE;
       for (int i = 0; i < arr.length; i++) {
           if(arr[i]>highest)
               highest=arr[i];

       }
       return highest;
   }
  public static int secondHighest(int[] arr){
       int highest = Integer.MIN_VALUE;
      for (int i = 0; i < arr.length; i++) {
          if(arr[i]==highest){
              arr[i] = Integer.MIN_VALUE;
          }

      }
      return highest;
  }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("please enter the value in an Array");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(highestValue(arr));
        System.out.println(secondHighest(arr));
    }

}
