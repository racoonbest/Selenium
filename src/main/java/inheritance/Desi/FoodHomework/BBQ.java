package inheritance.Desi.FoodHomework;

public class BBQ extends KindOfFood{
    public void getCalories(){

        System.out.println("900 calories");
    }

    @Override
    public void getCooked() {

    }

    public void getIngredients(){
        System.out.println("Pork,BBQ sause");
    }
}
