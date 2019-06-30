package com.tts.ToDo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tts.ToDo.Models.ToDoItem;
import com.tts.ToDo.Repos.ToDoItemRepo;

@Service
public class ToDoItemService {
	
	@Autowired
	private ToDoItemRepo toDoItemRepo;
	
	public List<ToDoItem> findAll(){
		return toDoItemRepo.findAll();
	}
	
	public void save(ToDoItem toDoItem) {
		toDoItemRepo.save(toDoItem);
	}

}
