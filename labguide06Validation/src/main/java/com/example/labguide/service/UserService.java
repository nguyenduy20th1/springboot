package com.example.labguide.service;

import com.example.labguide.entity.User;
import com.example.labguide.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Transactional
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Transactional
    public User saveUser(User user) {
        if (user.getId() == null) {
            return userRepository.save(user);
        }
        User user1 = userRepository.findById(user.getId()).orElse(null);
        user1.setFullName(user.getFullName());
        user1.setUsername(user.getUsername());
        user1.setPassword(user.getPassword());
        user1.setEmail(user.getEmail());
        user1.setPhone(user.getPhone());
        user1.setAddress(user.getAddress());
        user1.setIsActive(user.getIsActive());
        return userRepository.save(user1);
    }

    @Transactional
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
