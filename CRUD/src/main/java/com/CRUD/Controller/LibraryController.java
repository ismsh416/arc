package com.CRUD.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRUD.Repository.LibraryRepository;
import com.CRUD.entity.LibraryEntity;

@Service
@RestController
@RequestMapping("/api")
public class LibraryController {

	@Autowired
	LibraryRepository LibRepo;

	@RequestMapping("/echo")
	public String welcomePage() {
		return "welcome to the library";
	}

	@RequestMapping("/allbooks")
	public List<LibraryEntity> AllBooks() {
		return this.LibRepo.findAll();

	}
}
