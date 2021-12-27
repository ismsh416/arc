package com.Repository;


import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Entity.Story;

@Repository
public interface StoryRepository extends CrudRepository<Story, Serializable> {
	public Story findStorybyID(int storyID);
}