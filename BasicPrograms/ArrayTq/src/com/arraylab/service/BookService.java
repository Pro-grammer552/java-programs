package com.arraylab.service;

import arraylab.dag.BooksDAO;
import arraylab.model.Books;

public class BookService {

	static BooksDAO bookDAO = new BooksDAO();

	public  void addBookService(Books book) {
		bookDAO.addBook(book);
	}

	public boolean modifyBookNameService(int bookId, String bookName) {
		return bookDAO.modifyBookName(bookId, bookName);
	}

	public boolean modifypriceService(int bookId, double bookPrice) {
		return bookDAO.modifyBookPrice(bookId, bookPrice);
	}

	public Books[] getAllBookService() {
		return bookDAO.getAllBooks();
	}

}
