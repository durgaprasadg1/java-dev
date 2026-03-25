package CoreJava;

public class StaticKeyWord {

    // jbb bhi kisi class ke pass static variable hoge to unki value uss class ke sabhi variables ke liye same hogi.

    // They are call with the class name, they can also be called with the object but as they are class variables they should be called with the ClassName Only Not with object.

    // The static variable also should not be initialized at constructor. hai Ki nhi like kyu hi apne ko hrr baar usse initialize krna hai jbb vo static variable sbb ke liye same hi hone wala hai

    // So Rather than this what we will be doing is we will be using the STATIC block which will be running only once when the class is loaded and at that time we will be initializing the static variable.

    //Static block Always runs first because the class loads the first then objects are instantiated.

    // Below is the example,

    // This is how we can say that static makes variables or methods or classes , object independent.


    // --------- BUT ONE POINT IS TO NOT HERE IS ----
    // If we don't create an object of a class the static block will also not run because it will not load the class as well

    // To make the class to be loaded without the Object creation, we just use Class Class. Yeah there is a class named as class in java.
     // In the class class we have a method as forName taking the className there. The One precaution to be taken here is it throws error so we have to handle it.

    public static void main(String[] args) throws ClassNotFoundException {
//        Human h1 = new Human();
//        h1.age = 10;
//        h1.name = "DDDD";
//        Human h2 = new Human();
//        h2.age = 23;
//        h2.name = "KKKK";
//
//        h2.show();
        Class.forName("Human");

        



    }

}

class Human{
    int age;
    String name;
    static int roll;

    static{
        roll = 57;
        System.out.println("Human Static Block");
    }
    Human(){
    }

    public static void show(){
        System.out.println("Your rollcall is "+ roll );
    }

}
