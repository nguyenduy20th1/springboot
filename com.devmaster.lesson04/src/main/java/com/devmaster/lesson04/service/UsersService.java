package com.devmaster.lesson04.service;

import com.devmaster.lesson04.dto.UserDTO;
import com.devmaster.lesson04.entity.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    private final List<User> usersList = new ArrayList<>();

    public UsersService() {
        usersList.add(new User(1L, "user1", "pass1", "John Doe",
                LocalDate.parse("1990-01-01"), "john@example.com", "1234567890", calculateAge(LocalDate.parse("1990-01-01")), true));
        usersList.add(new User(2L, "user2", "pass2", "Jane Smith",
                LocalDate.parse("1992-05-15"), "jane@example.com", "0987654678", calculateAge(LocalDate.parse("1992-05-15")), false));
        usersList.add(new User(3L, "user3", "pass3", "Alice Johnson",
                LocalDate.parse("1985-11-22"), "alice@example.com", "3797297397", calculateAge(LocalDate.parse("1985-11-22")), true));
        usersList.add(new User(4L, "user4", "pass4", "Bob Brown",
                LocalDate.parse("1988-03-18"), "bob@example.com", "77917299172", calculateAge(LocalDate.parse("1988-03-18")), true));
        usersList.add(new User(5L, "user5", "pass5", "Charles Davis",
                LocalDate.parse("1995-09-20"), "char@example.com", "3484938793", calculateAge(LocalDate.parse("1995-09-20")), true));
    }

    public List<User> findAll() {
        return usersList;
    }

    public Boolean create(UserDTO userDTO) {
        try {
            Long newId = usersList.stream().map(User::getId).max(Long::compare).orElse(0L) + 1;

            User user = new User();
            user.setId(newId);
            user.setUsername(userDTO.getUsername());
            user.setPassword(userDTO.getPassword());
            user.setEmail(userDTO.getEmail());
            user.setFullName(userDTO.getFullName());
            user.setPhone(userDTO.getPhone());
            user.setBirthDay(userDTO.getBirthDay());
            user.setAge(calculateAge(userDTO.getBirthDay()));
            user.setStatus(userDTO.getStatus());

            usersList.add(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace(); // In lỗi ra console để dễ debug
            return false;
        }
    }

    private static int calculateAge(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
