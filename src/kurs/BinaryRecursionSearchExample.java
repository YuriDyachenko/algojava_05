package kurs;

public class BinaryRecursionSearchExample {

    public void execute() {
        System.out.println("- - - - - Задание 5.5 - - - - -");

        Duration duration = new Duration();
        ArraysMethods am = new ArraysMethods();
        String wordForSearch = am.getRandomValue();
        String[] arr = am.getCopyOfSortedArray();

        duration.fix(" Двоичный рекурсивный поиск:");
        int resBinaryRecursionSearch = binaryRecursionSearch(arr, wordForSearch, 0, arr.length - 1);
        duration.outAndFix("  индекс для " + wordForSearch + " = " + resBinaryRecursionSearch);

        duration.fix(" Двоичный обычный поиск:");
        int resBinarySearch = am.binarySearchInSortedArray();
        duration.outAndFix("  индекс для " + wordForSearch + " = " + resBinarySearch);
    }

    private int binaryRecursionSearch(String[] arr, String word, int left, int right) {
        if (left > right) return -1;
        int center = (left + right) / 2;
        int res = word.compareTo(arr[center]);
        if (res == 0) return center;
        if (res < 0 ) return binaryRecursionSearch(arr, word, left,right - 1);
        return binaryRecursionSearch(arr, word, left + 1, right);
    }

}
