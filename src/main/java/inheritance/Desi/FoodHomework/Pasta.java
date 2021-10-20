package inheritance.Desi.FoodHomework;

public abstract class Pasta extends KindOfFood {
    @Override
    public void getCooked() {
    }

        public void getCalories(){
        System.out.println("200 calories");
    }
        public void getIngredients(){
            System.out.println("Tomato sause,meat,cheesse");
        }
    }
