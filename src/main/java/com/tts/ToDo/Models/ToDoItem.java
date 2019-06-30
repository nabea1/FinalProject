package com.tts.ToDo.Models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDoItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String title;
	private String creator;
	private boolean status;
	private Date deadline;

	public ToDoItem() {}
	
	
	public ToDoItem(String title, String creator, boolean status, Date deadline) {
		this.title = title;
		this.creator = creator;
		this.status = status;
		this.deadline = deadline;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getCreator() {
		return creator;
	}


	public void setCreator(String creator) {
		this.creator = creator;
	}


	public boolean isStatus() {
		return status;
	}


	public void setStatus(boolean status) {
		this.status = status;
	}


	public Date getDeadline() {
		return deadline;
	}


	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	
	
	
}
