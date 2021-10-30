package inheritance.Anvar.HomeTaskBooks;

public class SchoolTextBook extends Books{


    private int numberOfSchoolBook = 0;
    public void setNumberOfBook(int numberOfSchoolBook){
        if (numberOfSchoolBook >= 0)
            this.numberOfSchoolBook = numberOfSchoolBook;
    }
        public int getNumberOfSchoolBook(){
        return numberOfSchoolBook;
        }


    public void getread(){
        System.out.println("Some Schools received new books this year");
    }
}
