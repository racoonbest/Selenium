package inheritance.Anvar.HomeTaskBooks;

public class Main8 {
    public static void main(String[]args){

        NovelBook Book1 = new NovelBook();
        Book1.setNumberofNovelBooks(9);
        System.out.println(Book1.getNumberofNovelBooks());
        Book1.setNumberofNovelBooks(-2);
        System.out.println(Book1.getNumberofNovelBooks());

        SchoolTextBook Book2 = new SchoolTextBook();
        Book2.setNumberOfBook(14);
        System.out.println(Book2.getNumberOfSchoolBook());
        Book2.setNumberOfBook(-5);
        System.out.println(Book2.getNumberOfSchoolBook());

        Book1 = new NovelBook();
        Book1.getread();

        Book2 = new SchoolTextBook();
        Book2.getread();

        Book1.goodForRead();

    }
}
