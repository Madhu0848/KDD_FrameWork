package JavaClass.JavaProject;

/*3	Display a menu until the user selects the exit option. for calculator program*/
/*"Menu
Add: 1 -> Print:
Substract: 2 -> Print: Option-2 Selected
Multiple:3  -> Print: Option-3 Selected
Divide: 4 -> Take 2 user input and divide
Exit:" */

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: ADD 2: SUB 3: MUL 4: DIV");
        System.out.println("Enter the option");
        int option = sc.nextInt();

        //com.qapitol.model
        //com.qapitol.controller
        // com.qapitol.services
        //com.qapitol.utils -- File OPeration



        System.out.println("Enter the two numbers");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        switch (option)
        {
            case 1:

                int add=number2+number1;
                System.out.println(add);
            break;

            case 2:
                int sub=number2-number1;
                System.out.println(sub);
            break;

            case 3:
                int mul=number2*number1;
                System.out.println(mul);
            break;

            case 4:
                int div=number1/number2;
                System.out.println(div);
                break;
                default:

        }

    }
}
