package CoreJava.Thread;

public class Anonymous_class_lambda_Fx {
    public static void main(String[] args) {
        Runnable A = () -> {
                for(int i = 0 ; i < 5 ; i++){
                    System.out.println("A kaa Hai");
                    try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
                }
        };
        Runnable B = () -> {
            for(int i = 0 ; i < 5 ; i++){
                System.out.println("B kaa Hai");
                try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
            }
        };
        Thread t1 = new Thread(A);
        Thread t2 = new Thread(B);

        t1.start();
        t2.start();

    }
}
