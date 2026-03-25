package CoreJava;

public class StaticKeyWord {

    // jbb bhi kisi class ke pass static variable hoge to unki value uss class ke sabhi variables ke liye same hogi.

    // They are call with the class name, they can also be called with the object but as they are class variables they should be called with the ClassName Only Not with object.

    // The static variable also should not be initialized at constructor. hai Ki nhi like kyu hi apne ko hrr baar usse initialize krna hai jbb vo static variable sbb ke liye same hi hone wala hai

    // So Rather than this what we will be doing is we will be using the static block which will be running only once when the class is loaded and at that time we will be initializing the static variable.


    // Below is the example,

    // This is how we can say that static makes variables or methods or classes , object independent.
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.age = 10;
        h1.name = "DDDD";
        Human h2 = new Human();
        h2.age = 23;
        h2.name = "KKKK";

        h2.show();

        



    }

}

class Human{
    int age;
    String name;
    static int roll;

    static{
        roll = 57;
    }
    Human(){
    }

    public static void show(){
        System.out.println("Your rollcall is "+ roll );
    }

}
