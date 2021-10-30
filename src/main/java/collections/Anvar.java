package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Anvar {
    public static void main (String[]args){
        Set<Integer> numbers = new HashSet<>();
        for (int i =0; i < 1000000; i++){
            numbers.add(i);


        }
        numbers.forEach(System.out::println);

        List<String> names = new ArrayList();
        names.add("Bob");
        names.add("Kayl");
        names.add("Kayl");
        names.add("Bella");
        names.add("Sara");
        names.forEach(System.out::println);

    }
}
