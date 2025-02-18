package com.devmaster.lesson01.pkg_stream_api;

import java.util.Arrays;
import java.util.List;


public class StreamExample {
    List<Integer> integerList = Arrays.asList(11,22,55,33,44,66);
    public void withoutStream() {
        int count = 0;
        for (Integer integer : integerList) {
            if (integer % 2 == 0) {
                count++;
            }
        }
        System.out.println("WithouStream -> Số phần tử chẵn:" + count);
    }
    public void withStream() {
        long count = integerList.stream().filter(i -> i % 2 == 0).count();
        System.out.println("WithStream -> Số phần tử chẵn:" + count);
    }
    public static void main(String[] args) {
        StreamExample streamExample = new StreamExample();
        streamExample.withoutStream();
        streamExample.withStream();
    }
}
