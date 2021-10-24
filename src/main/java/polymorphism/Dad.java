package polymorphism;

public class Dad extends Parent{
    public int WorkZipCode=11230;
    public int getWorkZipCode() {
        return WorkZipCode;
    }

    public void setWorkZipCode(int workZipCode) {
        WorkZipCode = workZipCode;
    }

    public void repair(){
        System.out.println("repairing");
    }
    public void work(){
        System.out.println("i'm busy at "+getWorkZipCode());

    }
}
