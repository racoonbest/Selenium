package inheritance.Desi.FoodHomework;

public abstract class BBQ extends KindOfFood{
    @Override
    public abstract void getCooked();{
    }
    public abstract void getCalories();{

        System.out.println("900 calories");
    }
    public abstract void getIngredients();{
        System.out.println("Pork,BBQ sause");
    }
}
