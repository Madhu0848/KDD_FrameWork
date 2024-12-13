package Test;

import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the num ");

       int num=0;
        try {
            num = sc.nextInt();
        }catch (Exception e){
            System.out.println("enter positive integer number");
            System.exit(0);
        }
        boolean checkNum= EvenNum.checkEven(num);

        if(checkNum==true)
            System.out.println("even number");
        else
            System.out.println("odd number");
    }

    public static boolean checkEven(int n) {

        for (int i = 0; i <= n; i++) {

            String str = String.valueOf(n);
            if (str.endsWith("0") || str.endsWith("2") || str.endsWith("4") || str.endsWith("6") || str.endsWith("8")) {
              return true;
            }
            
        }
        return false;
    }
}




