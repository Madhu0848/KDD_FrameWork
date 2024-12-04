package JavaClass.JavaProject;

public class reverseString {
    public static void main(String[] args) {

        String s="I AM AN AUTOMATION ENGINEERING";
        String reversed="";

        String [] s1=s.split(" ");

        for(int i=0 ;  i<s1.length ;i++){

          reversed=s1[i];

          for(int j=reversed.length()-1; j>=0; j--){

              System.out.print(reversed.charAt(j));

          }
            System.out.print(" ");


        }

    }
}
