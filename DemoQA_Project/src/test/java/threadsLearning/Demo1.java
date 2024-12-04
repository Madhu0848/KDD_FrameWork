package threadsLearning;
class A1 implements Runnable {

    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B1 implements Runnable {
    public void run(){
        for(int i=1; i<10; i++){
            System.out.println("hii");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Demo1 {
    public static void main(String[] args) {

        Runnable r = new A1();
        Runnable r1 = new B1();
        Thread t = new Thread(r);
        Thread t1 = new Thread(r1);
        t.start();
        t1.start();
    }
}
