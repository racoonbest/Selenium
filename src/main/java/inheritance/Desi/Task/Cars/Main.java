package inheritance.Desi.Task.Cars;

import inheritance.Desi.Task.Cars.Cars;

public class Main {
    public static void main(String[] args) {
        Cars bmw = new Cars();
        bmw.park("bmw");
        bmw.play("bmw");

        Cars camry = new Cars();
        camry.park("camry");
        camry.play("camry");

        Cars MB =new Cars();
        MB.park("MB");
        MB.play("MB");
    }
}
