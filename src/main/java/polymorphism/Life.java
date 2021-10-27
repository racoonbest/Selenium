package polymorphism;


import java.util.ArrayList;
import java.util.List;

public class Life {
    private static Object momsworkzipkode;

    public static void main (String[]args){
        Dad john = new Dad();
        Mom lisa = new Mom();
        Son mike = new  Son();
        Doughter sara = new Doughter();

        List<Kid> kids = new ArrayList<>();
        kids.add(mike);
        kids.add(sara);

        for(Kid kid :kids){
            kid.play();
        }

import java.util.*;

public class Life {

    public static void main(String[] args) {



        Dad john = new Dad();
        Mom lisa = new Mom();
        Son mike = new Son();
        Daughter sara = new Daughter();
        List<Kid> kids = new ArrayList<>();
        kids.add(mike);
        kids.add(sara);

        List<Human> humans = new ArrayList<>();
        humans.add(john);
        humans.add(lisa);
        humans.add(sara);
        humans.add(mike);


        for (Human human:humans){
            human.sleep();
        }

        Kindergarten happyKid = new Kindergarten();
        happyKid.takeCare(sara);
        happyKid.takeCare(mike);


        List<Parent> workPlace = new ArrayList<>();
        workPlace.add(lisa);
        workPlace.add(john);
        for (Parent parent:workPlace){
            parent.work();

        }
        john.setDadsworkzipcode(12545);
        lisa.setMomsworkzipcode(15895);
        john.work();
        lisa.work();

        for (Human human : humans) {
            human.sleep();
        }
//        Kindergarten happyKid = new Kindergarten();
//        happyKid.takeCare(sara);
//        happyKid.takeCare(mike);
//

//
//        List parent=new ArrayList();
//        parent.add(john);
//        parent.add(lisa);
//        parent.add(sara);
//        parent.add(mike);
//        parent.clear();
//
//        List parent1=new LinkedList();
//        parent1.add(john);
//        parent1.add(lisa);
//        parent1.add(sara);
//        parent1.add(mike);
//        parent1.clear();


            List number2=new ArrayList();
            number2.add(1);
            number2.add(2);
            number2.add(3);
            number2.add(4);
            number2.forEach(System.out::println);
            Set number=new HashSet();
            number.add(1);
            number.add(2);
            number.add(3);
            number.add(4);
            number.add(5);
            number.forEach(System.out::println);
            number.clear();
            number.forEach(System.out::println);














    }
}

    }
}






