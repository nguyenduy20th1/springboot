package org.example.lesson02.tight_loosely_coupling;

import java.util.Arrays;

public interface SortAlgoristhm {
    void sort(int[] arr);
}
class LosselyBubbleSortAlgoristhm implements SortAlgoristhm {
    public void sort(int[] arr) {
        System.out.println("Sorting bubble algorithm...");
        Arrays.stream(arr).sorted().forEach(System.out::println);
    }
}
