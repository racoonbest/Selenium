package polymorphism;

public class Dad extends Parent{

    String name;

    public int WorkZipCode;

    public int getWorkZipCode() {
        return WorkZipCode;
    }

    public void setWorkZipCode(int workZipCode) {
        this.WorkZipCode = workZipCode;
    }

    public void repair(){
        System.out.println("repairing");
    }
    public void work(){
        super.work(getWorkZipCode());
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
