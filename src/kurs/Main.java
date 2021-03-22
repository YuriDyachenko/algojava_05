package kurs;

public class Main {

    public static void main(String[] args) {
        //задание 5.1
        exampleOfUsingRecursion();
        //задание 5.2
        System.out.println("- - - - - Задание 5.2 - - - - -");
        infiniteRecursionExample();
        regularRecursionExample();
        //задание 5.3
        new CallStackSimpleExample().execute();
        new CallStackWithRecursionExample().execute();
        //задание 5.4
        new LoopAndRecursionExample().execute();
        //задание 5.5
        new BinaryRecursionSearchExample().execute();
        //задание 5.6
        new SortMergeExample().execute();
    }

    private static void regularRecursionExample() {
        System.out.println(" Пример обычной рекурсии с условием для выхода:");
        System.out.println("  calcSomeWithCondition(1) = " + calcSomeWithCondition(1));
    }

    private static void infiniteRecursionExample() {
        System.out.println(" Пример бесконечной рекурсии:");
        System.out.println("  заремлено, потому что программа выводит в консоль много мусора");
/*
        try {
            System.out.println("  calcSome(1) = " + calcSome(1));
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError");
        }
*/
    }

    private static int calcSome(int n) {
        System.out.println(n);
        return calcSome(n * 1000);
    }

    private static int calcSomeWithCondition(int n) {
        System.out.println(n);
        if (n >= 1000000000) return n;
        return calcSomeWithCondition(n * 1000);
    }

    private static void exampleOfUsingRecursion() {
        System.out.println("- - - - - Задание 5.1 - - - - -");
        System.out.println(" Примеры использования рекурсии в жизни:");
        System.out.println("  - начисление процентов по банковскому вкладу");
        System.out.println("  - круговорот воды в природе");
        System.out.println("  - резонанс");
        System.out.println(" Примеры использования рекурсии в математике:");
        System.out.println("  - факториал");
        System.out.println("  - числа Фибоначи");
    }

}
