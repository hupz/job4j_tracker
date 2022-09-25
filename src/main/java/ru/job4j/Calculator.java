package ru.job4j;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int divide(int q) {
        return q / x;
    }

    public int sumAllOperation(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(6);
        int rsl1 = minus(10);
        int rsl2 = calculator.divide(7);
        int rsl3 = calculator.sumAllOperation(result, rsl, rsl1, rsl2);
        System.out.println(rsl3);
    }
}
