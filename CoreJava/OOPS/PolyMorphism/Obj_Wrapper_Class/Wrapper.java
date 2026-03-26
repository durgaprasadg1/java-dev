package CoreJava.OOPS.PolyMorphism.Obj_Wrapper_Class;

public class Wrapper {
    public static void main(String[] args) {

        int num = 1;
        Integer num1 = num;
        System.out.println(num1);

        int num2 = num1.intValue();
        System.out.println(num2);

        String s = "12";
        int num3= Integer.parseInt(s) * 3;
        System.out.println(num3);
    }
}
