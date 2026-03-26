package OOPS.Inheritance;

public class SciCal extends Calculator {
    SciCal(){

        // by default super() call is here ---> Like John Cena -> You Cant see Me
        System.out.println("SciCal kaa Constructor");
    }
    SciCal(int a){
        this(); // this call to this() will call the default constructor of same( scical) class and then sciCal will be calling to the Parent class
        System.out.println("Parameterized Constructor of Scical");
    }
    public int sq(int a){
        return a * a;

    }
    public int cube(int a){
        return a*a*a;
    }
    
    
    
}
