package com.tts.ToDo.Repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.ToDo.Models.ToDoItem;

@Repository
public interface ToDoItemRepo extends CrudRepository<ToDoItem, Long> {

	List<ToDoItem> findAll();
}
