package polymorphism;


public class Mom extends Parent {
    public void cook(){
        System.out.println("I'm cooking");
    }


    private int momsworkzipcode = 0;
    public void setMomsworkzipcode(int momsworkzipcode){
        if (momsworkzipcode>=0)
            this.momsworkzipcode = momsworkzipcode;
        }
        public int getMomsworkzipcode(){
        return momsworkzipcode;
        }
        @Override
    public void work(){
        System.out.println("I'm busy at " + momsworkzipcode);
    }



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
