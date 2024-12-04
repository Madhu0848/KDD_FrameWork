package threadsLearning;

class A extends Thread {

    public void run(){
        for(int i=1; i<10; i++){
            System.out.println("hello");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
class B extends Thread {
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
public class Demo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
        System.out.println(a.getPriority());//it will give the current thread priority.
        b.setPriority(Thread.MAX_PRIORITY);
    }
}
