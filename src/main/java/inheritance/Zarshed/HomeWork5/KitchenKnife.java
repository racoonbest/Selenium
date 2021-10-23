package inheritance.Zarshed.HomeWork5;

public class KitchenKnife extends Knife {

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price>=0)
        this.price = price;
    }

    @Override
    public void kitchenToolMaterial() {
        System.out.println("stainless steel");
    }
}
