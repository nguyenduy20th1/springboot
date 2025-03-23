package com.devmaster.lesson08.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "book_author")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Getter
@Setter

public class BookAuthor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private Book book;

    @ManyToOne
    @JoinColumn(name = "author_id", nullable = false)
    private Author author;

    private Boolean isChief;

    public BookAuthor(Book book, Author author, boolean isChiefEditor) {
        this.book = book;
        this.author = author;
        this.isChief = isChiefEditor;
    }
}