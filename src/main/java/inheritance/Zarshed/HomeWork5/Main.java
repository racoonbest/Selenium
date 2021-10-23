package inheritance.Zarshed.HomeWork5;

public class Main {
    public static void main(String[] args) {

        Knife chefKnife=new Knife();
        Knife knifePrice=new Knife();
        chefKnife.clean();
        chefKnife.knifeMaterial();
        chefKnife.setPrice(35.99);
        System.out.println(chefKnife.getPrice());
    }
}
