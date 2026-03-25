package CoreJava;

public class StaticBlock {

    static {
        System.out.println("Static Block Executed");
    }
    StaticBlock(){
        System.out.println("StaticBlock Constructor Executed");
    }
    public static void main(String[] args) {
        System.out.println("Main Executed");
        StaticBlock a = new StaticBlock();
        StaticBlock b = new StaticBlock();
    }
}

