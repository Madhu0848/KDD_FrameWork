package JavaClass.JavaProject;

/*Flip the Coin Multiple Times : take number of time as input*/

import java.util.Random;

public class FlipCoin {

    public static void main(String[] args) {

        int head=1;
        int tail=0;

        for(int i=0; i<5; i++){
            Random rand = new Random();
            int num = rand.nextInt(2);

            if(num==tail){
                System.out.println(tail+": is tail");
            }
            else {
                System.out.println(head+": is head");
            }
        }


    }
}
