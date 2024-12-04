package JavaClass.JavaProject;

/*Find the sum  of digit */

public class SumofNum {
    public static void main(String[] args) {

        int num  =1235;
        int sum=0;

        while(num>0){
            sum=sum+num%10;
            num=num/10;

        }
        sum=sum+num;
        System.out.println(sum);

    }
}
