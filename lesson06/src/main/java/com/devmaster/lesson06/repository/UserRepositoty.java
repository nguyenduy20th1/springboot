package com.devmaster.lesson06.repository;

import com.devmaster.lesson06.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoty extends JpaRepository<User, Long> {
    //bổ sung code nếu cần
}