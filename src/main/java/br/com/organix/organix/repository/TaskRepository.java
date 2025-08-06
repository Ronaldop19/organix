package br.com.organix.organix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.organix.organix.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    
}
