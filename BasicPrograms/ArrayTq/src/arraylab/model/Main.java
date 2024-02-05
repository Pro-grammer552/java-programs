package arraylab.model;
import arraylab.dag.BooksDAO;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        BooksDAO b = new BooksDAO();

        b.addBook(new Books(1, "Java", 200));
        b.addBook(new Books(2, "C++", 150));
        b.addBook(new Books(3, "python", 350));

        System.out.println(Arrays.toString(b.getAllBooks()));
System.out.println("\n-----------------");
        
        b.modifyBookName(1, "Flutter");
        b.modifyBookPrice(2, 500);

        System.out.println(Arrays.toString(b.getAllBooks()));
    }
}
