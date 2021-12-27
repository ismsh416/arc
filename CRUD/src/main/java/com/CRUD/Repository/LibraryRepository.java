package com.CRUD.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CRUD.entity.LibraryEntity;

@Repository

public interface LibraryRepository extends JpaRepository<LibraryEntity, Integer> {

}
