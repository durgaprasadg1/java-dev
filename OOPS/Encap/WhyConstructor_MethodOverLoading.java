// package OOPS.Encap;

public class WhyConstructor_MethodOverLoading {

    // Bhai Constructor hote Kyu hai ?
    // Normal level ki baat chhode agr to dusri baat aisi hai ki jbb bhi hme object creation ke time database se connect krana ho to constructor is only way to do that . Jbb Bhi object bnega to constructor to run hoga hi jis wajah se connection hoga database se to ye one of the main reason hai uska.

    // method overloading is that when two methods have same name but needed to do the different work we use that.
    // two constructor can be there for 2 reasons like one without any arguments to be passed and another one is with some arguments.

//    Same method name, but different parameters (type, number, or order) within the same class.
    // this thing is shown below

    public class Human{
        int age ;
        String name ;
        Human(){
            this.age = 19;
            this.name = "Durgaprasad";
        }
        Human(int age, String name){
            this.age = age;
            this.name = name;
        }
    }


    // Also remember that if we dont define the constructor still we get the default (blank) constructor itself from JAVA.
    public static void main(String[] args) {

    }


}
