package com.Impl;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


//import com.onetoonehibernatejpa.repository.StoryRepository;

import com.Entity.Book;
import com.Repository.BookRepository;
import com.Repository.StoryRepository;
import com.Service.BookService;


@Service("bookServiceImpl")
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private StoryRepository storyRepository;

	@PersistenceContext
	private EntityManager entityManager;

	@Transactional
	public Book saveBook(Book book) {
		book = bookRepository.save(book);
		return book;
	}

	public Book findByBookId(int bookId) {
		Optional<Book> bookResponse = bookRepository.findById(bookId);
		Book book = bookResponse.get();
		return book;
	}
}