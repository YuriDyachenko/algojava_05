package kurs;

public class LoopAndRecursionExample {

    public void execute() {
        System.out.println("- - - - - Задание 5.4 - - - - -");

        Duration duration = new Duration();
        int n = 10;

        duration.fix(" Алгоритм, использующий цикл:");
        int resThroughLoop = factorialThroughLoop(n);
        duration.outAndFix("  факториал " + n + " = " + resThroughLoop);

        duration.fix(" Алгоритм, использующий рекурсию:");
        int resThroughRecursion = factorialThroughRecursion(n);
        duration.outAndFix("  факториал " + n + " = " + resThroughRecursion);
    }

    private int factorialThroughRecursion(int n) {
        if (n == 0) return 1;
        return n * factorialThroughRecursion(n - 1);
    }

    private int factorialThroughLoop(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
