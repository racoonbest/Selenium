package polymorphism;

public abstract class Parent extends Human {
        public void work(int zip){
            System.out.println("I'm busy at" + zip);
        }
        public abstract void work();
        public abstract String getName();

    @Override
    public abstract String toString();
}
