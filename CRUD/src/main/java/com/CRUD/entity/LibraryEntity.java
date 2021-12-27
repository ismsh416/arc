	package com.CRUD.entity;

import static javax.persistence.GenerationType.AUTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "library", schema = "public")
public class LibraryEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long bookid;
	
	private String bookname;

	private String author;
	
	private char available;
public LibraryEntity(){

}
	public LibraryEntity(Long bookid, String bookname, String author, char available) {
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
		this.available = available;
		System.out.println("something" +bookid);
	}


	public Long getBookid() {
		return bookid;
	}

	public void setBookid(Long bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public char getAvailable() {
		
		return available;
		
	}

	public void setAvailable(char available) {
		this.available = available;
		
	}

	@Override
	public String toString() {
		return "LibraryEntity"+"[bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", available=" + available + "]";
	}

}
