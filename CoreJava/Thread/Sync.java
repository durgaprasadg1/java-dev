package CoreJava.Thread;

class Counter{
    int cnt = 0;
    public synchronized void inc(){
        cnt++;
    }
}


public class Sync {
    public static void main(String[] args) throws InterruptedException {
        Counter a = new Counter();
        Runnable A = () -> { // lambda function used for the execution of only one method.
            for (int i = 0 ; i < 200 ; i++){
                a.inc();
            }
        };
        Runnable B = () -> { // lambda function used for the execution of only one method.
            for (int i = 0 ; i < 200 ; i++){
                a.inc();
            }
        };
        Thread t1 = new Thread(A);
        Thread t2 = new Thread(B);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(a.cnt);
    }

}
