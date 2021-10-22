package inheritance.Anvar.HomeTaskHouse;

public class Main7 {
    public static void main (String[]args){



        TownHouse House2 = new TownHouse();
        House2.setNumOfPeople(2);
        System.out.println(House2.getNumberOpPeople());
        House2.setNumOfPeople(-3);
        System.out.println(House2.getNumberOpPeople());

        TownHouse House3 = new TownHouse();
        System.out.println(House3.getNumberOpPeople());
    }
}
