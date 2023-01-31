package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x3 = Math.pow(x2 - x1, 2);
        double y3 = Math.pow(y2 - y1, 2);
        double rsl = Math.sqrt(x3 + y3);
        return rsl;
    }
    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
