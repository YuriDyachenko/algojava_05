package kurs;

public class CallStackSimpleExample {

    public void execute() {
        System.out.println("- - - - - Задание 5.3 - - - - -");

        System.out.println(" Пример простого стека вызовов:");
        methodA();
    }

    private void methodA() {
        System.out.println("  метод А - вход");
        methodB();
        System.out.println("  метод А - выход");
    }

    private void methodB() {
        System.out.println("   метод В - вход");
        methodC();
        System.out.println("   метод В - выход");
    }

    private void methodC() {
        System.out.println("    метод С - вход");
        System.out.println("    метод С - выход");
    }

}
