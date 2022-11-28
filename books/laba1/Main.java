package laba1;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args)
    {


        TreeSet<Book> books = new TreeSet<Book>(Book.compareByTitle);
        books.add(new Book("title1", "author1", 23, 0));
        books.add(new Book("atitle1", "buthor1", 25, 1));

        for (Book o: books)
        {
            System.out.println(o.toString());
        }
    }
}
