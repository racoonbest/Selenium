package inheritance.Zarshed.HomeWork4;

public class Bicycle extends Vehicle {

  private double speed;

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if (speed>=0){
            this.speed = speed;
        }


    }

    @Override
    public void condition() {
        System.out.println("bike running smoothly");
    }
}
