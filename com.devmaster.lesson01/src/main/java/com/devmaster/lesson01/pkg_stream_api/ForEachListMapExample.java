package com.devmaster.lesson01.pkg_stream_api;

import java.util.HashMap;
import java.util.Map;

public class ForEachListMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
