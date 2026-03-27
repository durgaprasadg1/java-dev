package CoreJava.OOPS.Interfaces;
interface Car{

    int wheel = 4;
    int power = 2;
    String engine = "Super ultra pro max";
    void run();
    void playMusic();
}
interface Bike{
    void silencerType();
}

interface Truck extends Car{
    int capacity = Integer.MAX_VALUE - 99;
}


class BMW implements Car, Bike{
    public void run(){
        System.out.println("Bhag Bhag BoseDK");
    }

    public void playMusic(){
        System.out.println("Volume kmm krr papa Jagg Jaega");
    }

    public void silencerType(){
        System.out.println("Ghang Ghang wala Silencer");
    }

}


@FunctionalInterface
interface Concert{
    void show();
}

class Badshah implements Concert{
    public void show(){
        System.out.println("Show the Reality");
    }
}
public class Sample {
    public static void main(String[] args) {
        BMW mine = new BMW();
        mine.run();
        mine.playMusic();
//        Car.wheel = 23;

//        System.out.println(Car.wheel);

        Badshah bd = new Badshah();
        bd.show();
    }
}
