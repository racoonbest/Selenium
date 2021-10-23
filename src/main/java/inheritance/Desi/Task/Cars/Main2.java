package inheritance.Desi.Task.Cars;

public class Main2 {
    public static void main(String[] args) {
        Car camry = new Toyota();
        camry.move();
        camry.play();
        camry.park();

        Car C63 = new MB();
        C63.move();
        C63.play();
        C63.park();

        Car X5 = new BMW();
        X5.move();
        X5.park();
    }
}
