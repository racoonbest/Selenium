package inheritance.Anvar.TaskDocktor;

public class Main3 {
    public static void main (String[]args){

        Surgeon David = new Surgeon();
        David.treat();

        FamilyDoctor Lora = new FamilyDoctor();
        Lora.treat();
    }
}
