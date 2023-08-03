package br.com.golfsierra.challengetodolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.golfsierra.challengetodolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
