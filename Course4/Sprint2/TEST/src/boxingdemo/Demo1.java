package boxingdemo;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        boolean b = true;
        Random r = new Random();
        int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < arr.length; i++)
            arr[i] = r.nextInt(100);
       while(b==true) {
           try {
               int index = sc.nextInt();

               System.out.println("Value on given index = " + arr[index]);
               b = false;

           } catch (ArrayIndexOutOfBoundsException e) {
               System.out.println("outOfBounds");
           }
           catch (InputMismatchException e) {
               sc.nextLine();
               System.out.println("enter integer value only");
           }
       }

    }
}
