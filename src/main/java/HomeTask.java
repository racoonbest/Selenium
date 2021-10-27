import jdk.nashorn.internal.ir.IfNode;

import java.util.*;

public class HomeTask {
    public static <number> void main(String[] args) {
        List<String> names = new ArrayList();
        names.add("John");
        names.add("John");
        names.add("Frank");
        names.add("Jonson");
        names.add("Armen");
        names.forEach(System.out::println);


        Set <Integer> number = new LinkedHashSet();
        number.add(3);
        number.add(2);
        number.add(1);
        number.add(4);
        number.add(4);
        number.forEach(System.out::println);

    }
}
