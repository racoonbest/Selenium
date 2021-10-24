package polymorphism;

public class Mom extends Parent{

    public int WorkZipCode;

    public int getWorkZipCode() {
        return WorkZipCode;
    }

    public void setWorkZipCode(int workZipCode) {
        WorkZipCode = workZipCode;
    }

    public void cook(){
        System.out.println("cooking");
    }
    public void work(){
        System.out.println("I'm busy at "+getWorkZipCode());
    }

}
