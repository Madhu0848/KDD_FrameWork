package JavaClass.JavaProject;

/* Check if a person is eligible to vote.*/

import java.util.Scanner;

public class eligibleforVote {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();

        switch (age >= 18 ? 1 : 0) {
            case 1:
                System.out.println("you are eligible for vote");
                break;
            case 0:
            default:
                System.out.println(" Not eligible for vote");
                break;


        }


    }
}
