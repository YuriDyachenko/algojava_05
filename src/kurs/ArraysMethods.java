package kurs;

import java.util.Arrays;
import java.util.Random;

public class ArraysMethods {
    private final int size = 400;
    private final String[] baseArray;
    private final String[] sortedArray;
    private final Random random;
    private final String randomValue;

    public ArraysMethods() {
        random = new Random();
        baseArray = new String[size];
        fillBaseArray();
        sortedArray = getCopyOfBaseArray();
        Arrays.sort(sortedArray);
        randomValue = baseArray[random.nextInt(size)];
    }

    public String[] getCopyOfBaseArray() {
        return Arrays.copyOf(baseArray, size);
    }

    public String[] getCopyOfSortedArray() {
        return Arrays.copyOf(sortedArray, size);
    }

    private void fillBaseArray() {
        String consonants = "qwrtpsdfghklzxcvbnmjy";
        String vowels = "euioa";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < baseArray.length; i++) {
            int length = random.nextInt(6) + 5;
            for (int j = 0; j < length; j++) {
                stringBuilder.append(getRandomChar(j % 2 == 0 ? consonants : vowels));
            }
            baseArray[i] = stringBuilder.toString();
            stringBuilder.delete(0, stringBuilder.length());
        }
    }

    private char getRandomChar(String s) {
        return s.charAt(random.nextInt(s.length()));
    }

    public String getRandomValue() {
        return randomValue;
    }

    public int binarySearchInSortedArray() {
        int low = 0;
        int high = size - 1;
        while (low <= high) {
            int middle = (low + high) / 2;
            int res = sortedArray[middle].compareTo(randomValue);
            if (res < 0) low = middle + 1;
            else if (res > 0) high = middle - 1;
            else return middle;
        }
        return -1;
    }
}
