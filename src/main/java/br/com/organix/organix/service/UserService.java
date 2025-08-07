package br.com.organix.organix.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.organix.organix.model.User;
import br.com.organix.organix.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    
    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    private final String adminRole = "ADMIN";
    private final String managerRole = "MANAGER";
    private final String defaultRole = "USER";
    
    public String getDefaultRole() {
        return defaultRole;
    }

    public String getAdminRole() {
        return adminRole;
    }

    public String getManagerRole() {
        return managerRole;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    public User createUser(User user){
        
        if (userRepository.existsByUsername(user.getUsername())) {
            throw new IllegalArgumentException("Username already exists");
        }

        if (userRepository.existsByEmail(user.getEmail())) {
            throw new IllegalArgumentException("Email already exists");
        }
        
        String encodedPassowrd = passwordEncoder.encode(user.getPassword());
        
        // user.addRole(defaultRole);

        return userRepository.save(new User(
            user.getFullName(),
            user.getEmail(),
            user.getUsername(),
            encodedPassowrd,
            user.getRole()
        ));
    }
}
