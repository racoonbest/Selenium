package inheritance.Zarshed.Day4;

public abstract class Movie {
    public void play(){
        System.out.println("playing a movie");
    }
    public void stop(){
        System.out.println("stopping a movie");
    }
    public abstract void like();
    public abstract void unlike();
    public abstract void description();

}
