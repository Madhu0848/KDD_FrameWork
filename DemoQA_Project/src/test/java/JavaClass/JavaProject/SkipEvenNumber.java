package JavaClass.JavaProject;

/* Skip even numbers and stop the loop when the number is greater than 20. using continue*/

public class SkipEvenNumber {
    public static void main(String[] args) {

      for(int i=1 ; i < 50; i++){


          if(i%2==0){
             continue;
          }
          if(i>20) {
              break;
          }
          System.out.println(i);

      }

    }
}
