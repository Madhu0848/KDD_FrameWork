package JavaClass.JavaProject;
/* Stop the loop when a certain number is reached, and skip others based on a condition. using break and continue*/

public class breakContinue {
    public static void main(String[] args) {

        int stopNumber=8;
        int skipNumber=5;
        for(int i=1; i<=20; i++){

            if(i==skipNumber){
                System.out.println("skipping the number"+i);
                continue;
            }
            if(i==stopNumber){
                System.out.println("stopping the number"+i);
                break;
            }
            System.out.println("Number "+i+" is "+i);

        }

    }
}
