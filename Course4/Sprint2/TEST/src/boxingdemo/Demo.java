package boxingdemo;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf(78);
        Double d2 = Double.valueOf(123);
        String s = String.valueOf(47);
        System.out.println(s);
        Double d3 = Double.valueOf("87");
        System.out.println("d3 = " + d3);
        System.out.println(d2);
        Integer i1 = 50;//auto boxing

        int number = integer;//un-boxing
        Double d1 = 50.3;
        double d = d1;
    }
    public static void printArr(){
        Random r = new Random();
        int[] arr = new int[100];
        try {
            for (int i = 0; i <= arr.length; i++) {
                arr[i]= r.nextInt(10);
                System.out.println("arr[" + i + "]" + arr[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("outOfBounds");
        }
    }
}
