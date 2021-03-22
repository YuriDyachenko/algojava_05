package kurs;

import java.util.Arrays;

public class CallStackWithRecursionExample {

    public void execute() {
        System.out.println(" Пример стека вызовов с рекурсией:");
        int n = 5;
        System.out.println("  факториал " + n + " = " + factorial(n));
    }

    private int factorial(int n) {
        System.out.println(spaceString(n + 2) + " внутри метода факториал(" + n + ")");
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    private String spaceString(int n) {
        char[] chars = new char[n];
        Arrays.fill(chars, ' ');
        return new String(chars);
    }
}
