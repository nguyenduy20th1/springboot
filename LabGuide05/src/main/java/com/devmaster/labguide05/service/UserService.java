package com.devmaster.labguide05.service;

import com.devmaster.labguide05.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    private final List<User> users = new ArrayList<>();

    public UserService() {
        users.add(new User(1L, "Hoàng Anh", "Hà Nội"));
        users.add(new User(2L, "Bảo Lâm", "Hà Nội"));
    }

    public List<User> getUsers() {
        return users;
    }

    public User getUserById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }

    public void saveUser(User user) {
        if (user.getId() == null) {
            user.setId((long) users.size() + 1); // Tạo ID tự động
            users.add(user);
        } else {
            for (int i = 0; i < users.size(); i++) {
                if (users.get(i).getId().equals(user.getId())) {
                    users.set(i, user);
                    break;
                }
            }
        }
    }

    public void deleteUser(long id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}

