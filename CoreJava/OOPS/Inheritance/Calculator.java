package CoreJava.OOPS.Inheritance;

public class Calculator{
    Calculator(){
        System.out.println("Calculator ka Constructor");
    }
    public int sum(int a , int b){
        return a + b;
    }
    public int sub(int a , int b){
        return a - b;
    }
    public int mul(int a , int b){
        return a * b;
    }
    public int div(int a , int b){
        return a / b;
    }
}
