package com.CRUD.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRUD.model.Library;
import com.CRUD.repository.LibraryRepository;

@RestController
@RequestMapping

public class LibraryController {
	@Autowired

	private LibraryRepository LibRepo;
	@GetMapping("/welcome")
	public String welcome()
	{
		return "Welcome To the Library";
	}
	@GetMapping("/allbooks")
	public List<Library> getAllbooks() {
		return this.LibRepo.findAll();
	}

	@PostMapping("/allbooks/{id}")
	public ResponseEntity<Optional<Library>> getBookById(@PathVariable(value = "id") Long bookid) throws Exception {
		Optional<Library> lib = LibRepo.findById(bookid);
	
			return ResponseEntity.ok().body(lib);
	}
	

	// @PutMapping
	// public ResponseEntity<Library> UpdateBook(@PathVariable(value = "id") Long
	// bookid){

///	},

//	@RequestBody
	// Library bookdetails)
//	{
	// return null;
	// return UpdateBook(bookid);

}