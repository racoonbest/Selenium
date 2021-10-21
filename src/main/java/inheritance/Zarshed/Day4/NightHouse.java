package inheritance.Zarshed.Day4;

public class NightHouse extends Movie{
    @Override
    public void like() {
        System.out.println("liked a movie");

    }

    @Override
    public void unlike() {

    }

    @Override
    public void description() {
        System.out.println("dark secret about the house her late husband built");

    }
}
