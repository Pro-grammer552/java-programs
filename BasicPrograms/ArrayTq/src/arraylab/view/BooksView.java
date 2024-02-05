package arraylab.view;

import arraylab.dag.BooksDAO;
import arraylab.model.Books;
import com.arraylab.service.BookService;
import java.util.Scanner;

public class BooksView {

	static Scanner sc = new Scanner(System.in);

	static BookService bookService = new BookService();

	static void getAllBooks() {

		Books[] booksArray = bookService.getAllBookService();

		for (Books b : booksArray) {
			if (b != null)
				System.out.println(b);
		}

	}

	static void addBook() {

		System.out.println("Enter the Book Id");
		int bookId = sc.nextInt();

		System.out.println("Enter the Book Name");

		String bookName = sc.next();

		System.out.println("Enter the Book Price");

		double bookPrice = sc.nextDouble();

		Books newBook = new Books(bookId, bookName, bookPrice);
		bookService.addBookService(newBook);
		System.out.println("");

		System.out.println();
	}

	static void modifyBookName() {
		System.out.println("------UPDATE BOOKNAME-------");
		System.out.println("Enter the Book Id");
		int bookId = sc.nextInt();

		System.out.println("Enter the Book Name");
		String bookName = sc.next();

		boolean modify = bookService.modifyBookNameService(bookId, bookName);

		if (modify) {
			System.out.println("modified Sucessfully");
		} else {
			System.out.println(bookId + "not found");
		}

	}

	static void modifyBookPrice() {
		System.out.println("-----UPDATE PRICE--------");
		System.out.println("Enter the Book Id");
		int bookId = sc.nextInt();
		System.out.println("Enter the Book Price");
		double bookPrice = sc.nextDouble();

		boolean m = bookService.modifypriceService(bookId, bookPrice);

		if (m) {
			System.out.println("modified Sucessfully");
		} else {
			System.out.println(bookId + "not found");
		}

		System.out.println();
	}

	public static void main(String[] args) {

//		BooksView b=new BooksView();
//		System.out.println("-------------");
//		BooksView.addBook();
//		BooksView.getAllBooks();
//		BooksView.addBook();
//		BooksView.getAllBooks();
//		System.out.println("------UPDATE BOOKNAME-------");
//		BooksView.modifyBookName();
//		BooksView.getAllBooks();
//		System.out.println("-----UPDATE PRICE--------");
//		BooksView.modifyBookPrice();
//		BooksView.getAllBooks();
//
//		System.out.println("Close the Application .........");

		int choice;
		
		do {
			System.out.println("Choose The operation");
			System.out.println("1.Add new  Book");
			System.out.println("2.Modify the Book name");
			System.out.println("3.Modify The Book Price");
			System.out.println("4.Show All Records");

			System.out.println("Enter the Choice");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				addBook();
				System.out.println("Sucessfully Updated");
				break;
			case 2:
				modifyBookName();
				System.out.println("Sucessfully Modified BookName");
				break;
			case 3:
				modifyBookPrice();
				System.out.println("Sucessfully Modified Price");
				break;
			case 4:
				getAllBooks();
				break;
			default:
				System.out.println("try Again.......");
				break;
			}

		} while (choice!=0);
		
		
		
		//sc.close();
	}

}
