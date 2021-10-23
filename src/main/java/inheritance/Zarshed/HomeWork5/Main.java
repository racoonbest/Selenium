package inheritance.Zarshed.HomeWork5;

public class Main {
    public static void main(String[] args) {

        KitchenKnife chefKnife=new KitchenKnife();
        KitchenKnife ceramic=new KitchenKnife();
        ceramic.setPrice(45.50);
        System.out.println(ceramic.getPrice());
        chefKnife.cut();
        chefKnife.kitchenToolMaterial();
        chefKnife.setPrice(35.99);
        System.out.println(chefKnife.getPrice());
    }
}
