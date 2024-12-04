package demo.java.exceptionhandling;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TryCatch {

    @Test
    public void test() {
        PrintWriter pw;
        try {
            pw = new PrintWriter("jtp.txt"); //may throw exception
            pw.println("saved");
        }
       // providing the checked exception handler
        catch (FileNotFoundException e) {

            System.out.println(e);
        }
        System.out.println("File saved successfully");
        try {
            int a=9/0;
        } catch (ArithmeticException e) {
            System.out.println(e+"child");
        }
        try{
            String a="aacd";
            System.out.println(a.charAt(5));
        } catch (Exception e) {
            System.out.println(e);
            }
        try{
         String a=null;
            System.out.println(a.length());

        }catch(Exception e){
           System.out.println(e);
        }
        try {
           int [] a={1,2,3,4,5};
            System.out.println(a[6]);
        }catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("finally");
        }

    }
}
