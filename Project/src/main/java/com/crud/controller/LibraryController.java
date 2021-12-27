package com.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.crud.model.Library;
import com.crud.repository.LibraryRepository;


@RestController
@RequestMapping("/api")

public class LibraryController {
	@Autowired

	private LibraryRepository LibRepo;

	@GetMapping("/allbooks")
	public List<Library> getAllbooks() {
		return this.LibRepo.findAll();
	}

	@GetMapping("/allbooks/{id}")
	public ResponseEntity<Optional<Library>> getBookById(@PathVariable(value = "id") Long bookid) throws Exception {
		Optional<Library> lib = LibRepo.findById(bookid);
	
			return ResponseEntity.ok().body(lib);
			
	}
	@PostMapping("/allbooks/{bookid}")
	public Library add(@RequestBody Library libr) {
		return this.LibRepo.save(libr);
	}
	@PutMapping("/allbooks/{bookid}")
	public ResponseEntity<Library> update(@PathVariable(value = "bookid") Long bid,@Validated @RequestBody Library bookdetails)
	{
		Library lib=LibRepo.findById(bid).orElseThrow();
		lib.setId(bookdetails.getId());
		lib.setBookname(bookdetails.getBookname());
		lib.setBookavailable(bookdetails.getBookavailable());
		lib.setBookauthor(bookdetails.getBookauthor());
	
		System.out.println(lib.toString());
		return ResponseEntity.ok(this.LibRepo.save(lib));
	}


}