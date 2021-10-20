package inheritance.Zarshed.HomeWork2;

public abstract class Food {
    public abstract void ingredients();
    public abstract void calorie();
    public void eaten(){
        System.out.println("ready to eat");
    }
    public void getCooked(){
        System.out.println("cooked well done");
    }
}
