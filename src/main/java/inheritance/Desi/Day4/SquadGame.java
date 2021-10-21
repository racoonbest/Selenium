package inheritance.Desi.Day4;

public class SquadGame extends Movie {
    public void play(){
        System.out.println("Play movie");
    }
    public void stop(){
        System.out.println("Movie just stopped");
    }
    public void like(){
        System.out.println("I really like this movie");
    }
    public void unlike(){
        System.out.println("May be you don't like the movie");
    }
    public void description(){
        System.out.println("Is about a game that if you don't pass you can die");
    }
}
