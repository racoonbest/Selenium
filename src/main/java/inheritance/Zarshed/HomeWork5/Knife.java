package inheritance.Zarshed.HomeWork5;

public class Knife extends KitchenTool {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>=0)
        this.price = price;
    }

    @Override
    public void knifeMaterial() {
        System.out.println("stainless steel");
    }
}
