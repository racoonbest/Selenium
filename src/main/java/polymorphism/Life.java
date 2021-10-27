package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Life {
    public static void main(String[] args) {
        Dad john = new Dad();
        Mom lisa = new Mom();
        Son mike = new Son();
        Daughter sara = new Daughter();
//        List<Kid> kids = new ArrayList<>();
//        kids.add(mike);
//        kids.add(sara);
//        List<Human> humans = new ArrayList<>();
//        humans.add(john);
//        humans.add(lisa);
//        humans.add(sara);
//        humans.add(mike);
//        for (Human human : humans) {
//            human.sleep();
//        }
//        Kindergarten happyKid = new Kindergarten();
//        happyKid.takeCare(sara);
//        happyKid.takeCare(mike);
        lisa.setWorkZipCode(11230);
        john.setWorkZipCode(11221);



        List<Parent> workPlaces=new ArrayList<>();
        workPlaces.add(lisa);
        workPlaces.add(john);

        for (Parent parent:workPlaces
             ) {parent.work();

        }





    }
}





