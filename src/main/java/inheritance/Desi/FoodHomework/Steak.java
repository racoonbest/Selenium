package inheritance.Desi.FoodHomework;

public class Steak extends KindOfFood{
        public void getCalories(){
        System.out.println("800 calories");
    }

    @Override
    public void getCooked() {

    }

    public void getIngredients(){
            System.out.println("Beef,sause");
        }
    }