package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sumMinusDivide(10, 20));
        System.out.println("Результат расчета равен: " + sumMinusDivideSumMultiply(10, 20));
    }

    public static double sumMinusDivide(double first, double second) {
        return minus(first, second)
                + divide(first, second);
    }

    public static double sumMinusDivideSumMultiply(double first, double second) {
        return minus(first, second)
                + divide(first, second)
                + sum(first, second)
                + multiply(first, second);
    }
}


