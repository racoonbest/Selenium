package inheritance.Anvar.HomeTaskBooks;

public class NovelBook extends Books{


    private int numberofNovelBooks = 0;
    public void setNumberofNovelBooks(int numberofNovelBooks){
        if (numberofNovelBooks >= 0)
            this.numberofNovelBooks = numberofNovelBooks;
        }
        public int getNumberofNovelBooks(){
        return numberofNovelBooks;
        }

    public void getread (){
        System.out.println("I like to read Novelbooks");
    }

}
