package com.CRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRUD.model.Library;

@Repository
public interface LibraryRepository extends JpaRepository<Library, Long>{

}
