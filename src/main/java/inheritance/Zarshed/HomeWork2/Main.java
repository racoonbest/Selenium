package inheritance.Zarshed.HomeWork2;

public class Main {
    public static void main(String[] args) {
      BBQ barbeque=new BBQ();
      barbeque.eaten();
      barbeque.getCooked();
      barbeque.ingredients();
      barbeque.calorie();

      Burger newYork=new Burger();
      newYork.eaten();
      newYork.getCooked();
      newYork.ingredients();
      newYork.calorie();

      Pasta spaghetti=new Pasta();
      spaghetti.eaten();
      spaghetti.getCooked();
      spaghetti.ingredients();
      spaghetti.calorie();

      Steak surprise =new Steak();
      surprise.eaten();
      surprise.getCooked();
      surprise.ingredients();
      surprise.calorie();

      Pizza cheesepizza= new Pizza();
      cheesepizza.eaten();
      cheesepizza.getCooked();
      cheesepizza.ingredients();
      cheesepizza.calorie();

    }
}
