package JavaClass.JavaProject;

/* Find the largest of three numbers.*/

public class LargeNumber {

    public static void main(String[] args) {

        int a=10;
        int b=20;
        int c=30 ;

        if((a>b) && (a>c)){
            System.out.println("The is grater value is : "+a);
        }
        else if((b>a) && (b>c)){
            System.out.println("The is grater value is : "+b);
        }
        else {
            System.out.println("The is grater value is : "+c);
        }
    }
}
