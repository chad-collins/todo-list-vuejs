package net.chadcollins.todoapi;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import net.chadcollins.todoapi.models.Todo;
import net.chadcollins.todoapi.repos.TodosRepo;

@Service
public class Initializer implements CommandLineRunner{

	@Resource
	TodosRepo todosRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		todosRepo.save(new Todo("Create front end with view", true));
		todosRepo.save(new Todo("Create api", false));
		
	}
}
