package inheritance.Zarshed.ClassTask;

public class FamilyDoctor  extends Doctor{
    public void treat(){
        System.out.println("giving advice");
    }

    @Override
    public void goToWork() {
        System.out.println("going to work");
    }
}
