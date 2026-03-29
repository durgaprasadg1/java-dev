package CoreJava.Input;
// One thing to always remember : Always close the resourses after your part of use is being done. Or use resources in trycatch block so that you can add finaaly at the end and close resource there.
import java.util.Scanner;

public class PhlaInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        System.out.println("Dekho vo aa gya "+ a);
    }
}
