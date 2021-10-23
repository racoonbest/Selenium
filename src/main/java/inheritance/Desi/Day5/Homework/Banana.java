package inheritance.Desi.Day5.Homework;

public class Banana extends Fruit {

   private   int weight;

   public int getWeight() {
        return weight;
    }

    public boolean setWeight(int weight) {
        if (weight >= 0) {
            this.weight = weight;
            return true;

        }else {
            return false;
        }

    }

}
