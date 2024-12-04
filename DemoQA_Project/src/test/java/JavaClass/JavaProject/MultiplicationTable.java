package JavaClass.JavaProject;

/* Enter the range (n) to generate multiplication tables (1 to n):
* "User input is : 3
Multiplication Table for 1:
1 x 1 = 1
1 x 2 = 2
...
1 *10 = 10
Multiplication Table for 2:
2 x 1 = 2
2 x 2 = 4
...
2*10 =20
Multiplication Table for 3:
3 x 1 = 3
3 x 2 = 6
......
3*10 = 30"
*  */

import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+"*"+j+"="+i*j);
            }
        }

    }
}
