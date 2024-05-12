package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] postfix) {
        for (int index = 0; index < postfix.length; index++) {
            if (postfix[postfix.length - index - 1] != word[word.length - index - 1]) {
                return false;
            }
        }
        return true;
    }
}