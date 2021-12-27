package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.crud.model.Library;

@RepositoryRestResource(path="lib")
public interface LibraryRepository extends JpaRepository<Library, Long>{

}
