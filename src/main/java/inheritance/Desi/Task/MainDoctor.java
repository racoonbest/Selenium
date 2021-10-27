package inheritance.Desi.Task;

public class MainDoctor {
    public static void main(String[] args) {
        Surgeon John = new Surgeon();
        John.performSurgery();


        FamilyDoctor Lisa = new FamilyDoctor();
        Lisa.giveAdvice();


    }
}
