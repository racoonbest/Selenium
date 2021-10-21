package inheritance.Anvar.HomeTaskFood;

public class Main4 {

    public static void main (String[]args){
        Pasta foodPasta = new Pasta();
        foodPasta.cook();
        foodPasta.ingredients();
        foodPasta.Eat();

        Burger foodBurger = new Burger();
        foodBurger.cook();
        foodBurger.ingredients();
        foodBurger.Eat();

        Stake foodStake = new Stake();
        foodStake.cook();
        foodStake.ingredients();
        foodStake.Eat();

    }
}

