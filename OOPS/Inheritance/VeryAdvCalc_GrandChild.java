package OOPS.Inheritance;

public class VeryAdvCalc_GrandChild extends SciCal{
    VeryAdvCalc_GrandChild(){
        System.out.println("Very Adv Cons");
    }
    public int power(int base, int index){
       return (int)Math.pow(base, index);
    }

}
