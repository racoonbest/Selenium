package inheritance.Desi.FoodHomework;

public class Burger extends KindOfFood{

        public void getCalories() {
            System.out.println("500 calories");
        }

    @Override
    public void getCooked() {

    }

    public void getIngredients(){
                System.out.println("Chicken,lettuce,tomato,cheesse");
            }

}
