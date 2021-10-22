package inheritance.Desi.Day4.TreeHomework;

import inheritance.Anvar.HomeTaskTree.AppleTree;

public class Main {
    public static void main(String[] args) {
        Cherry pinkCherry = new Cherry();
        pinkCherry.getWatered();
        pinkCherry.getCutted();
        pinkCherry.description();

        Apple greenApple = new Apple();
        greenApple.getWatered();
        greenApple.getCutted();
        greenApple.description();

        Banana yellowBanana = new Banana();
        yellowBanana.getWatered();
        yellowBanana.getCutted();
        yellowBanana.description();

        AppleTree fuji = new AppleTree();
       fuji.getWatered();



    }
}
