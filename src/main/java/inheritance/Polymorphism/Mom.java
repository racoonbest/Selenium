package inheritance.Polymorphism;

import javax.xml.namespace.QName;

public  class Mom extends Parent {

    public int workZipCode = 90043;

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

    public void setName(String name) {

    }

}