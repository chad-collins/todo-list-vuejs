package net.chadcollins.todoapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Todo {

	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private boolean completed;
	
	public Todo() {}
	
	public Todo(String title, boolean completed) {
		this.title = title;
		this.completed = completed;
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public boolean isCompleted() {
		return completed;
	}
	
}
