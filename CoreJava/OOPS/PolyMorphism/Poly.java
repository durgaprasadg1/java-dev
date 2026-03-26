package CoreJava.OOPS.PolyMorphism;

class A{
    public void show(){
        System.out.println("A Kaa Hai Jo bhi Hai");
    }
}
class B extends A{
    public void show(){
        System.out.println("B Kaa Hai Jo bhi Hai");
    }
}

class C extends A{
    public void show(){
        System.out.println("C Kaa Hai Jo bhi Hai");
    }
}

class D{
    public void show(){
        System.out.println("C Kaa Hai Jo bhi Hai");
    }
}


public class Poly {
    public static void main(String[] args) {
        A refA = new A();
        refA.show();

        B refB = new B();
        refB.show();

        refA = new C();
        refA.show();


//        refA = new D(); // This is not allowed

        final int a = 100; // To Make the constants,  in java we use the final key word

        System.out.println(a);
//        a = 2999;


    }


}
