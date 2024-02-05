package arraylab.dag;

import java.util.Arrays;

import arraylab.model.Books;

/*
 2. Create a package named arraylab.dao, In this package add a new class named, BooksDAQ
	a.In this class declare a static array variable which is of type Book.
 	b. Define a method named add Book with parameter of Book type. 
 	   This method will add a new book to static book array variable.
       This method will not return any value.
	C. Define a method named modifyBookName which will have two parameters bookid 
	   and bookName. 
	   This method will iterate through static book array variable,
       find the bookid and modify the book name. 
       This method will return a boolean value. 
       If bookid is not found it will return false else it will return true.
d. Similarly, define method named modifyBookPrice
 */

public class BooksDAO {
	private static Books[] booksArray = new Books[3];
	static int bookCount = 0;

	public boolean addBook(Books book) {

		if (bookCount < booksArray.length) {
			booksArray[bookCount] = book;
			bookCount++;
		} else {
			return false;
		}

		return true;

	}

	// find the bookid and modify the book name.
	public boolean modifyBookName(int bookId, String bookName) {

		for (int i = 0; i < bookCount; i++) {
			if (booksArray[i].getBookId() == bookId) {
				booksArray[i].setBookName(bookName);
				return true;
			}

		}

		return false;
	}

	// find the bookid and modify the book price.
	public boolean modifyBookPrice(int bookId, double bookPrice) {
		for (int i = 0; i < bookCount; i++) {
			if (booksArray[i].getBookId() == bookId) {
				booksArray[i].setBookPrice(bookPrice);
				return true;
			}
		}

		return false;
	}
	
	public Books[] getAllBooks() {
	
		return booksArray;
	}
	
	

	
}
