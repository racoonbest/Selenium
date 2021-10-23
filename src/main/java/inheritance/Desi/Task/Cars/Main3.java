package inheritance.Desi.Task.Cars;

import inheritance.Desi.Task.Animals.Dog;
import inheritance.Desi.Task.Animals.Tiger;
import inheritance.Desi.Task.Animals.Wolf;

public class Main3 {
    public static void main(String[] args) {
        Cat Missy = new Cat();
        Missy.eat();
        Missy.sleep();
        Missy.makeSound();


        Tiger Roro = new Tiger();
        Roro.eat();
        Roro.sleep();
        Roro.makeSound();

        Dog Husky = new Dog();
        Husky.eat();
        Husky.sleep();
        Husky.makeSound();

        Wolf Gufy = new Wolf();
        Gufy.eat();
        Gufy.sleep();
        Gufy.makeSound();
    }
}
