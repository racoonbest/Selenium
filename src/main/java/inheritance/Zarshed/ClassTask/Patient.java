package inheritance.Zarshed.ClassTask;

public class Patient {
    FamilyDoctor doctor=new FamilyDoctor() {
        @Override
        public void doctor() {
            System.out.println("give advice");
        }
    };

}
