package com.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ijlibrary")
public class Library {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookid")
	private long id;

	@Column(name = "bookname")
	private String bookname;
	
	@Column(name = "author")
	private String bookauthor;
	
	@Column(name = "available")
	private String bookavailable;

	public Library() {
		super();
	}

	public Library(String bookname, String bookauthor, String bookavailable) {
		super();
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookavailable = bookavailable;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public String getBookavailable() {
		return bookavailable;
	}

	public void setBookavailable(String bookavailable) {
		this.bookavailable = bookavailable;
	}

}
