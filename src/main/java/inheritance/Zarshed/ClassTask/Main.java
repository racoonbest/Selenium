package inheritance.Zarshed.ClassTask;

public class Main {
    public static void main(String[] args) {
        FamilyDoctor John =new FamilyDoctor();
        John.treat();
        John.goToWork();
        Surgeon Anna=new Surgeon();
        Anna.treat();
        Anna.goToWork();
        Dentist Emma=new Dentist();
        Emma.treat();
        Emma.goToWork();



    }



}

