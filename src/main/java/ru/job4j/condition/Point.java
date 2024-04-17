package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(5, 2, 8, 3);
        System.out.println("result (5, 2) to (8, 3) " + result);
    }
}
