package inheritance.Zarshed.HomeWork4;

public abstract class Vehicle {

    public void go(){
        System.out.println("vehicle is moving");
    }
    public void stop(){
        System.out.println("vehicle is stopping");
    }
    public abstract void condition();
}
