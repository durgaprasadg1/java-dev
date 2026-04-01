package CoreJava.SealedClass;

sealed class A permits B,C,E{

}
sealed class B  extends A permits D{

}
non-sealed class C extends A{

}
non-sealed class D extends B{

}
final class E extends A{

}

record Alien (int a , String Name){}
public class Demo {
    public static void main(String[] args) {
        Alien a = new Alien(13, "Nihal");
        Alien b = new Alien(26, "Rya");
        Alien c = new Alien(39, "Suyog");

        System.out.println(a);
        System.out.println(a.equals(b));
        System.out.println(c.Name());
    }
}
