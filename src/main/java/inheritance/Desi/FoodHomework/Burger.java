package inheritance.Desi.FoodHomework;

public abstract class Burger extends KindOfFood{

    @Override
    public void getCooked() {
    }
        public void getCalories() {
            System.out.println("500 calories");
        }
            public void getIngredients(){
                System.out.println("Chicken,lettuce,tomato,cheesse");
            }

}
