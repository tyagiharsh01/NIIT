package primeNumber;

public class Impl  {
    public static void main(String[] args) {
        PrimeNumber primeNumber = (int n)->{
            if (n <= 1)
                return false;

            // Check from 2 to n-1
            for (int i = 2; i*i < n; i++)
                if (n % i == 0)
                    return false;

            return true;
        };
        System.out.println(primeNumber.isPrime(90));
    }


}
