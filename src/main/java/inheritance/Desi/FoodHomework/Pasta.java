package inheritance.Desi.FoodHomework;

public class Pasta extends KindOfFood {
        public void getCalories(){
        System.out.println("200 calories");
    }

    @Override
    public void getCooked() {

    }

    public void getIngredients(){
            System.out.println("Tomato sause,meat,cheesse");
        }
    }
