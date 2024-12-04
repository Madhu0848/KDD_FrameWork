package JavaClass.JavaProject;
/* Find all Armstrong numbers between 1 and 1000. */

public class AmstrongNumber {
    public static void main(String[] args) {

        int num=153;
        int sum=0;
        int rem=1;
        int temp=num;
        while (num>0){
          rem=num%10;
          rem=rem*rem*rem;
          sum=sum+rem;
          num=num/10;

        }
        if(sum==temp){
            System.out.println("number is amstrong: "+sum);
        }
        else{
            System.out.println("number is not amstrong: "+sum);
        }


    }
}
