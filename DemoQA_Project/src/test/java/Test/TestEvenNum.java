package Test;

import java.util.Scanner;

public class TestEvenNum {
    public static void main(String[] args) {

        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        boolean lastOdd = false;
        boolean lastEven = false;

        for (int i = 0; i < n.length; i++) {

            boolean temp = TestEvenNum.checkEven(n[i]);
            if (temp == true) {
                if (lastEven == false) {
                    System.out.println(n[i]);
                    lastEven = true;
                } else {
                    lastEven = false;
                }
            } else {
                if (lastOdd == false) {
                    System.out.println(n[i]);
                    lastOdd = true;
                } else {
                    lastOdd = false;
                }
            }

        }

    }
    public static boolean checkEven(int num) {

        if (num % 2 == 0) {
            return true;
        } else
            return false;

    }

}
