package com.api.book.bootrestbook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.book.bootrestbook.dao.BookRepository;
import com.api.book.bootrestbook.entities.Book;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;

	public List<Book> getAllBooks() {
		return (List<Book>) this.bookRepository.findAll();
	}

	public Book getBookById(int id) {
		return this.bookRepository.findById(id);
	}

	public Book addBook(Book b) {
		return bookRepository.save(b);
	}

	public void deleteBook(int bookId) {
		this.bookRepository.deleteById(bookId);
	}

	public void updateBook(Book book, int bookId) {
		book.setId(book.getId());
		bookRepository.save(book);
	}
}
