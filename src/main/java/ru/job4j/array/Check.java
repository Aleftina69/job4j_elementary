package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = data[0];
        for (boolean chek : data) {
            if (chek != result) {
                return false;
            }
        }
        return true;
    }
}
