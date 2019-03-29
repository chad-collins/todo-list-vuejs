package net.chadcollins.todoapi.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.chadcollins.todoapi.models.Todo;

@Repository
public interface TodosRepo extends CrudRepository<Todo, Long> {

}
