package inheritance.Polymorphism;

import java.util.*;

public class main {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.forEach(System.out::println);


        List name = new ArrayList();
        
        String john = new String();
        String sara = new String();
        String lisa = new String();
        String mike = new String();



        name.add("john");
        name.add("lisa");
        name.add("sara");
        name.add("mike");
        name.forEach(System.out::println);

    }
}