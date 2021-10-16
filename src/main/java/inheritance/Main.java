package inheritance;

public class Main {

    //Circle - 1 and Square - 2 and Triangle - 3
    // rotate
    //display picture of shape
    public static void main(String[] args) {

        Main obj1 = new Main();
        obj1.rotate(1);
    }

    public void rotate(int shapeNumber){
        if(shapeNumber == 1){
            System.out.println("rotating circle");

         }else if(shapeNumber==2){
            System.out.println("rotating square");
        }else if(shapeNumber==3){
            int y;
            int x;
            System.out.println("rotating triangle");
        }
    }

    public void displayPicture(int shapeNumber){

        if(shapeNumber == 1){
            System.out.println("showing circle");

        }else if(shapeNumber==2){
            System.out.println("showing square");
        }else if(shapeNumber==3){
            int y;
            int x;
            System.out.println("showing triangle");
        }
    }

}
