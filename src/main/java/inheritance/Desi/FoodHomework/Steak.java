package inheritance.Desi.FoodHomework;

public abstract class Steak extends KindOfFood {
    @Override
    public abstract void getCooked();{
    }
        public abstract void getCalories();{

        System.out.println("800 calories");
    }
        public abstract void getIngredients();{
            System.out.println("Beef,sause");
        }
    }