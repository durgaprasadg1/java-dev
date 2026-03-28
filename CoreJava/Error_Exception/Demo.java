package CoreJava.Error_Exception;

public class Demo {
    public static void main(String[] args) {
        int a = 223;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch (Exception e){
            System.out.println("Something wrong happened : " + e.getLocalizedMessage());
            // do not return from here to allow the rest code below the catch block, to run.
        }

        System.out.println("Chalne Do");
    }
}
