package net.codejava.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.codejava.model.Todo;


@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
}