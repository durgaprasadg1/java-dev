package CoreJava.OOPS.Abstraction;


abstract class Car{
    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("Music is playing");
    }
}
class BMW extends Car{
    public void fly(){

    }
    public void drive(){
        System.out.println("Challo");
    }
}
public class Abstract_KeyWord {
    public static void main(String[] args) {
        Car a  = new BMW();
        a.playMusic();
        a.drive();
    }
}
