package JavaClass.JavaProject;

/*
swap the number without using 3rd variable
 */
public class SwapNumber {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        a=a+b; //30
        b=a-b; //10
        a=a-b;//20
        System.out.println(a);//20
        System.out.println(b);//-10

    }
}
