package com.tts.ToDo.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.tts.ToDo.Models.ToDoItem;
import com.tts.ToDo.Services.ToDoItemService;

@Controller
public class ToDoItemController {
	
	@Autowired
	private ToDoItemService toDoItemService;
	
	
	@GetMapping("/")
	public String IndexPageWithTheToDoList(Model model) {
		
		model.addAttribute("Items", toDoItemService.findAll());
		
		return "WebPages/Index";
	}
	
	@GetMapping("/NewItem")
	public String creatingANewItem(Model model , ToDoItem toDoItem) {
		
		return "WebPages/NewItem";
	}
	
	@PostMapping("/NewItemCreated")
	public String routingBackToTheWelcome(Model model, ToDoItem toDoItem) {
		toDoItemService.save(toDoItem);
		model.addAttribute("Items", toDoItemService.findAll());
		
		return "WebPages/Index";
	}

}
