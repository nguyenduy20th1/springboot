package com.devmaster.lesson08.repository;

import com.devmaster.lesson08.entity.BookAuthor;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookAuthorRepository extends JpaRepository<BookAuthor, Long> {

    @Transactional
    @Modifying
    @Query("DELETE FROM BookAuthor ba WHERE ba.book.id = :bookId")
    void deleteByBookId(@Param("bookId") Long bookId);

    // 📌 Lấy danh sách BookAuthor theo bookId
    List<BookAuthor> findByBookId(Long bookId);
}

