package inheritance.Zarshed.Day4;

public class SquadGame extends Movie {

    @Override
    public void like() {
        System.out.println("liked movie");

    }

    @Override
    public void unlike() {

    }

    @Override
    public void description() {
        System.out.println("Hundreds of cash-strapped players accept a strange invitation to compete in children's games. Inside, a tempting prize awaits — with deadly high stakes.");

    }
}
