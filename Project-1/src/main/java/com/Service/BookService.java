package com.Service;

import org.springframework.stereotype.Component;

import com.Entity.Book;

@Component
public interface BookService {
	public Book saveBook(Book book);

	public Book findByBookId(int bookId);// Optional
}
