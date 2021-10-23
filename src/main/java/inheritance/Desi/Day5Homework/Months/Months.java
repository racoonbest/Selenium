package inheritance.Desi.Day5Homework.Months;

public class Months {
   private  int numberOfMonths;

    public int getNumberOfMonths() {
        return numberOfMonths;
    }

    public boolean setNumberOfMonths(int numberOfMonths) {
        if (numberOfMonths >= 0) {
            this.numberOfMonths = numberOfMonths;
            return true;

        }else {
            return false;
        }

    }

}
