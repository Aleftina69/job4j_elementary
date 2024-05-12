package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] prefix) {
        for (int index = 0; index < prefix.length; index++) {
            if (prefix[index] != word[index]) {
                return false;
            }
        }
        return true;
    }
}
