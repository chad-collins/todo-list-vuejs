package net.chadcollins.todoapi.controllers;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.chadcollins.todoapi.models.Todo;
import net.chadcollins.todoapi.repos.TodosRepo;

@RestController
@RequestMapping("/todo")
public class TodoController {

	@Resource
	TodosRepo todosRepo;
	
	@GetMapping("")
	public Collection<Todo> getTodos(){
		return (Collection<Todo>) todosRepo.findAll();
	}
}
