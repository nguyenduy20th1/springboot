package org.example.lesson02.tight_loosely_coupling;

public class LoopselyCoupleService {
    private SortAlgoristhm sortAlgoristhm;
    public LoopselyCoupleService() {}
    public LoopselyCoupleService(SortAlgoristhm sortAlgorithm) {
        this.sortAlgoristhm = sortAlgorithm;
    }
    public void complexBusiness(int[] arr) {
        sortAlgoristhm.sort(arr);
    }
    public static void main(String[] args) {
        LoopselyCoupleService sortAlgorithm = new LoopselyCoupleService(new LosselyBubbleSortAlgoristhm());
        sortAlgorithm.complexBusiness(new int[]{6,2,1,4,5,3,7,9,8});
    }
}
