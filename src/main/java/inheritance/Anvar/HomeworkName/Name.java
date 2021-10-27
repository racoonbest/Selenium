package inheritance.Anvar.HomeworkName;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Name {
    public static <number>void main(String[]args){
        List <String>names = new ArrayList();
        names.add("Bob");
        names.add("Kayl");
        names.add("Kayl");
        names.add("Bella");
        names.add("Sara");
        names.forEach(System.out::println);

        Set<Integer> numbers1 = new HashSet();
        numbers1.add(112);
        numbers1.add(113);
        numbers1.add(114);
        numbers1.add(114);
        numbers1.add(115);

        numbers1.forEach(System.out::println);

    }
}
