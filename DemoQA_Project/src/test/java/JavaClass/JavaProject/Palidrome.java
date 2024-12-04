package JavaClass.JavaProject;
/* Check Palindrom of string and number */

import org.testng.annotations.Test;

public class Palidrome
 {
    @Test
         public void checkPalindrome(){
         String s1 = "moma";
         String s2 = "";
         for (int i = s1.length() - 1; i >= 0; i--) {
             s2=s2+s1.charAt(i);
         }
         if(s1.equalsIgnoreCase(s2)){
             System.out.println("Palidrome number");
         }
         else{
             System.out.println("Not a palidrome number");
         }

     }
     @Test
     public void checkPalindrome2(){
        int num =121;
        int rem=1;
        int rev=0;
        int  temp=num;

        while (num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
         }
        if(temp==rev){
            System.out.println("Palidrome number");
        }
        else{
            System.out.println("Not a palidrome number");
        }
     }

 }
