package CoreJava.Collections;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("Alpha");
        li.add("Beta");
        li.add("Gamma");
        li.add("Theta");

        List<String> str = li.stream().filter((s)-> s.startsWith("B")).toList();
        System.out.println(str.get(0));
    }
}
