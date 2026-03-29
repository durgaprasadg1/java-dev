package CoreJava.Thread;

import com.sun.jdi.request.ExceptionRequest;

class A implements Runnable{
    public void run(){
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("A kaa Hai");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("B kaa Hai");
            try{
                Thread.sleep(10);
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
public class Demo {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
