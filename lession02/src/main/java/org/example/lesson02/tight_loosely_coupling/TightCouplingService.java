package org.example.lesson02.tight_loosely_coupling;

import java.util.Arrays;

class BubbleSortAlgoristhm {
    public void sort(int[] arr) {
        System.out.println("Sắp xếp theo giải thuật BubberSort");
        int n = arr.length;
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}

public class TightCouplingService {
    private BubbleSortAlgoristhm bubbleSortAlgorithm = new BubbleSortAlgoristhm();
    public TightCouplingService() {}
    public TightCouplingService(BubbleSortAlgoristhm bubbleSortAlgorithm) {
        this.bubbleSortAlgorithm = bubbleSortAlgorithm;
    }

    public void complexBussinessSort(int[] arr) {
        bubbleSortAlgorithm.sort(arr);
        Arrays.stream(arr).forEach(System.out::println);
    }
    public static void main(String[] args) {
        TightCouplingService tightCouplingService = new TightCouplingService();
        tightCouplingService.complexBussinessSort(new int[]{6, 2, 7, 5, 4, 3, 1, 10});
    }
}
