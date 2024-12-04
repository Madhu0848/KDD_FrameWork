package JavaClass.JavaProject;

public class PrimeNumber {

    public static void main(String[] args) {
        int m=1;
        int n=20;
        boolean isPrime=false;

        for(int i=m;i<=n;i++) {

            isPrime = checkPrime(i);
            if (isPrime) {
                System.out.println(i + " is prime");
            }
        }

    }
    public static boolean checkPrime(int m) {

        int count = 0;
        for (int i = 1; i <= m; i++) {
            if (m % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        }
        else{
            return false;
        }
    }

}

