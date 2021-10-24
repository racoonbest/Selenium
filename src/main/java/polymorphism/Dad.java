package polymorphism;

public class Dad extends Parent{
    public void repair(){
        System.out.println("Repairing");
    }

    private int dadsworkzipcode = 0;
    public void setDadsworkzipcode(int dadsworkzipcode){
        if (dadsworkzipcode>=0)
            this.dadsworkzipcode = dadsworkzipcode;
    }
    public int getDadsworkzipcode(){
        return dadsworkzipcode;
    }
    @Override
    public void work(){
        System.out.println("I'm busy at " + dadsworkzipcode);
    }
}
