package com.devmaster.labguide05.service;

import com.devmaster.labguide05.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> users = new ArrayList<>();
    public List<User> findAll() {
        return users;
    }

    public User addUser(User user) {
        try {
            User newUser = new User();
            newUser.setName(user.getName());
            newUser.setAge(user.getAge());
            newUser.setEmail(user.getEmail());
            newUser.setAddress(user.getAddress());
            users.add(newUser);
            return newUser;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
