package br.com.organix.organix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.organix.organix.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    
}
