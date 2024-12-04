package JavaClass.JavaProject;

/* Sum of Array Elements using for-each */

public class SumOfArray {

    public static void main(String[] args) {
        int a[] ={1,2,3,4,5,6,7};

        int sum=0;
        for(int num:a){
            sum+=num;
        }
        System.out.println("The sum of array elements is: " + sum);

    }
}
