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











    }
}
