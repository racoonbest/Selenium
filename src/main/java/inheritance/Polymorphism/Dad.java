package inheritance.Polymorphism;

public class Dad extends Parent{
    String name;
    public int workZipCode = 90032;

    public int getWorkZipCode() {
        return workZipCode;
    }
        public void work () {
            System.out.println("I am busy");
        }
        public void setWorkZipCode ( int workZipCode){
        if (workZipCode >=0)
            this.workZipCode = workZipCode;

        }
    }