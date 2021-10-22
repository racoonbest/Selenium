package inheritance.Anvar.HomeTaskHouse;

public class TownHouse extends House{

        private int numOfPeople = 0;
        public void setNumOfPeople(int numOfPeople){
            if(numOfPeople>=0)
                this.numOfPeople = numOfPeople;
        }

        public int getNumberOpPeople(){
            return numOfPeople;
        }

    public void getbuild(){
        System.out.println("Town House build with wood");
    }
}
