package inheritance.Polymorphism;

import inheritance.Zarshed.HomeWork5.KitchenKnife;
import jdk.nashorn.internal.scripts.JO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Life {

    public static void main(String[] args) {


        Son mike = new Son();
        Daughter sara = new Daughter();

        List<Kid> kids = new ArrayList<>();
        kids.add(mike);
        kids.add(sara);

        for (Kid kid : kids) {
            kid.play();
        }
        Kindergarten happyKid = new Kindergarten();
        happyKid.takeCare(sara);
        happyKid.takeCare(mike);


        Dad john = new Dad();
        Mom lisa = new Mom();
        List<Parent> parents = new ArrayList<>();
        parents.add(john);
        parents.add(lisa);

        WorkPlace boa = new WorkPlace();
        boa.goToWork(parents);
        lisa.setWorkZipCode(90038);
        john.setWorkZipCode(90045);


        List parent = new ArrayList();

        List parent2 = new LinkedList();


        parent.add(john);
        parent.add(lisa);
        parent.add(sara);
        parent.add(mike);


        parent2.add(john);
        parent2.add(lisa);
        parent2.add(sara);
        parent2.add(mike);
        }
    }
