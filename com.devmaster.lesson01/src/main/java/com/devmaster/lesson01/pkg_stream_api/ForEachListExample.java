package com.devmaster.lesson01.pkg_stream_api;

import java.util.Arrays;
import java.util.List;

public class ForEachListExample {
    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP", "JS", "Ruby");

        System.out.println("Sử dụng biểu thức Lambda: ");
        languages.forEach(lang -> System.out.println(lang));

        System.out.println("Sử dụng method reference: ");
        languages.forEach(System.out::println);
    }
}
