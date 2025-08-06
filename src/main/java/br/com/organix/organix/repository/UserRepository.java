package br.com.organix.organix.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.organix.organix.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
