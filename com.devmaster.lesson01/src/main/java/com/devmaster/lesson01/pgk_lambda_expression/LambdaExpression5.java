package com.devmaster.lesson01.pgk_lambda_expression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Book {
    int id;
    String name;
    float price;
    public Book(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String toString() {
        return "Book {id=" + id + ", name=" + name + ", price=" + price + "}";
    }
}
public class LambdaExpression5 {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "SpringBoot", 9.95f));
        books.add(new Book(2, "HTML,CSS", 19.95f));
        books.add(new Book(3, "JavaScript", 12.95f));
        books.add(new Book(4, "Ruby", 29.95f));
        books.add(new Book(5, "PHP", 19.95f));

        books.stream()
                .filter(b -> b.price > 15)
                .forEach(System.out::println);
    }
}
