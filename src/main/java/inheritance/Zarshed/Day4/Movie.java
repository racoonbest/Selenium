package inheritance.Zarshed.Day4;

public abstract class Movie {
    public void play(){
        System.out.println("playing a movie");
    }
    public void stop(){
        System.out.println("stopping a movie");
    }
    public void like(){
        System.out.println("liked a movie");
    }
    public void unlike(){
        System.out.println("Unliked a movie");
    }
    public abstract void description();

}
