package inheritance.Anvar.HomeTaskTree;

public class AppleTree extends Tree{


    String name ="AppleTree";
    private int height;

    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        if (height>=0){
            this.height =height;
        }
    }



    public void getWatered(){
        System.out.println("Apple trees gets water from the ditch");
    }
    public void cutteddown(){
        System.out.println("Apple trees cut off down when they withered and died");
    }
    public void describe(){
        System.out.println("Apple trees good for nature and they bear fruit");
    }
    public void bloom(){
        System.out.println("Apple trees are not very strong and they are blooming often");
    }


}
