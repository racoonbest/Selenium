package inheritance.Desi.Task.Cars;

public class Cars {
    public void move(String make) {
        if(make.equals("Toyota")){
            System.out.println("I'm moving");

        }else if (make.equals("BMW")) {
            System.out.println("I am moving fast");


        }

    }
        public void park(String make){

            if (make.equals("MB")){
                System.out.println("I'm parking with premium breaks");
            }else {
                System.out.println("I'm parking");
            }
        }

        public void play(String make){

            if (make.equals("bmw")){
                System.out.println("My car is playing music with quality");
            }else {
                System.out.println("My car is playing music");
            }

        }
}
