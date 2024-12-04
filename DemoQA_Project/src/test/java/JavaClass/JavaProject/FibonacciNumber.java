package JavaClass.JavaProject;
/* Print Fibonacci series */

public class FibonacciNumber {

    public static void main(String[] args) {
        int n=10;
        int n1=0;
        int n2=1;
        int sum=0;

        for(int i=1;i<=n;i++) {

            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            System.out.println(sum);
        }
        }

    }


