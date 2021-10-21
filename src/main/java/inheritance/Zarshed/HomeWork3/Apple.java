package inheritance.Zarshed.HomeWork3;

public class Apple extends Tree{

    String name;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int height;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void cutting() {
        System.out.println("late winter");

    }

    @Override
    public void describe() {
        System.out.println("a small tree that can reach 25 feet in height with a crown spread of 25 feet");

    }

    @Override
    public void bloom() {
        System.out.println("bloom early to late May ");

    }
}
