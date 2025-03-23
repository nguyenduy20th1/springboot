package com.devmaster.lesson08.service;

import com.devmaster.lesson08.entity.Author;
import com.devmaster.lesson08.entity.Book;
import com.devmaster.lesson08.entity.BookAuthor;
import com.devmaster.lesson08.repository.AuthorRepository;
import com.devmaster.lesson08.repository.BookAuthorRepository;
import com.devmaster.lesson08.repository.BookRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private BookAuthorRepository bookAuthorRepository; // Thêm BookAuthorRepository
    @Autowired
    private AuthorRepository authorRepository;

    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

//    public Book saveBook(Book book) {
//        return bookRepository.save(book);
//    }

    public Book getBookById(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Transactional
    public void deleteBook(Long bookId) {
        bookAuthorRepository.deleteByBookId(bookId);
        bookRepository.deleteById(bookId);
    }

    @Transactional
    public void saveBook(Book book, List<Long> authorIds, Long chiefEditorId) {
        if (book.getId() != null) {
            Book existingBook = bookRepository.findById(book.getId())
                    .orElseThrow(() -> new RuntimeException("Book not found"));

            existingBook.getBookAuthors().clear();

            for (Long authorId : authorIds) {
                Author author = authorRepository.findById(authorId).orElse(null);
                if (author != null) {
                    boolean isChief = (chiefEditorId != null && chiefEditorId.equals(authorId));
                    existingBook.getBookAuthors().add(new BookAuthor(existingBook, author, isChief));
                }
            }

            bookRepository.save(existingBook);
            return;
        }

        List<BookAuthor> bookAuthors = new ArrayList<>();
        for (Long authorId : authorIds) {
            Author author = authorRepository.findById(authorId).orElse(null);
            if (author != null) {
                boolean isChief = (chiefEditorId != null && chiefEditorId.equals(authorId));
                bookAuthors.add(new BookAuthor(book, author, isChief));
            }
        }
        book.setBookAuthors(bookAuthors);
        bookRepository.save(book);
    }

    public List<Author> getAuthorsByBookId(Long bookId) {
        return bookAuthorRepository.findByBookId(bookId)
                .stream()
                .map(BookAuthor::getAuthor)
                .toList();
    }
}
