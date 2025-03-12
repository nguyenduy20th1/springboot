package com.devmaster.lesson06.service;

import com.devmaster.lesson06.entity.User;
import com.devmaster.lesson06.repository.UserRepositoty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepositoty userRepositoty;

    //lấy toàn bộ user
    public List<User> getAllUsers() {
        return userRepositoty.findAll();
    }

    //tạo mới
    public User createUser(User user) {
        return userRepositoty.save(user);
    }

    //cập nhật
    public User updateUser(User user) {
        return userRepositoty.save(user);
    }

    //xóa
    public void deleteUser(Long id) {
        userRepositoty.deleteById(id);
    }
}
