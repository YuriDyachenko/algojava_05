package kurs;

import java.util.Arrays;

public class SortMergeExample {

    public void execute() {
        System.out.println("- - - - - Задание 5.6 - - - - -");

        Duration duration = new Duration();
        ArraysMethods am = new ArraysMethods();
        String[] arr = am.getCopyOfBaseArray();

        duration.fix();
        String[] sortedArrayBySortMerge = sortMerge(arr);
        duration.outAndFix("  Сортировка слиянием");

        duration.fix();
        Arrays.sort(arr);
        duration.outAndFix("  Сортировка Arrays.sort");
        System.out.println("   сравнение отсортированных массивов = " + Arrays.equals(arr, sortedArrayBySortMerge));
    }

    private String[] sortMerge(String[] arr) {
        if (arr == null) return null;
        if (arr.length < 2) return arr;
        String[] arrLeft = new String[arr.length / 2];
        System.arraycopy(arr, 0, arrLeft, 0, arr.length / 2);
        String[] arrRight = new String[arr.length - arrLeft.length];
        System.arraycopy(arr, arr.length / 2, arrRight, 0, arr.length - arrLeft.length);
        return mergeArrays(sortMerge(arrLeft), sortMerge(arrRight));
    }

    private String[] mergeArrays(String[] arrayA, String[] arrayB) {
        String[] res = new String[arrayA.length + arrayB.length];
        int positionA = 0;
        int positionB = 0;
        for (int i = 0; i < res.length; i++) {
            if (positionA == arrayA.length){
                res[i] = arrayB[positionB];
                positionB++;
            } else if (positionB == arrayB.length) {
                res[i] = arrayA[positionA];
                positionA++;
            } else if (arrayA[positionA].compareTo(arrayB[positionB]) < 0) {
                res[i] = arrayA[positionA];
                positionA++;
            } else {
                res[i] = arrayB[positionB];
                positionB++;
            }
        }
        return res;
    }
}
