package polymorphism;

public class Mom extends Parent{

    String name;

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
