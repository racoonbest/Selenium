package inheritance.Desi.Day4;

public class NightHouse extends Movie {
    public void play(){
        System.out.println("Will you play this movie?");
    }
    public void stop(){
        System.out.println("Can you stop the movie?");
    }
    public void like(){
        System.out.println("Do you like the movie?");
    }
    public void unlike(){
        System.out.println("I think you don't like this movie");
    }
    public void description(){
        System.out.println("Is about a night house");
    }
}
