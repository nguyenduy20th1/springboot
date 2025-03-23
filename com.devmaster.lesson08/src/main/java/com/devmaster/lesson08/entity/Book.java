package com.devmaster.lesson08.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String name;
    private String description;
    private String imgUrl;
    private Integer quantity;
    private Double price;
    private Boolean isActive;

    //tao moi quan he voi bang author
//    @ManyToMany
//    @JoinTable( //jointable tạo bảng trung gian
//                // bảng trung gian là bảng liên kết giữa 2 thực thể và một quyển sách có thể chứa nhiều tác giả
//            //name chỉ định tên bảng trung gian
//            name = "Book_Author",
//            //tạo cột bookid là khóa ngoại của book
//            joinColumns = @JoinColumn(name = "bookId"),
//            //có inverse là tạo cột khóa ngoại của author
//            inverseJoinColumns = @JoinColumn(name = "authorId")
//    )

    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BookAuthor> bookAuthors = new ArrayList<>();

    // Thêm phương thức getter để lấy danh sách tác giả trực tiếp
    public List<Author> getAuthors() {
        return bookAuthors != null
                ? bookAuthors.stream().map(BookAuthor::getAuthor).collect(Collectors.toList())
                : new ArrayList<>();
    }
}
