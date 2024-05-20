package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To2Then5() {
        int left = 5;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3To3Then3() {
        int left = 3;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To3To5Then5() {
        int first = 2;
        int second = 3;
        int third = 5;
        int result = Max.max(first, second, third);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax6To13To67To4Then67() {
        int first = 6;
        int second = 13;
        int third = 67;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = 67;
        assertThat(result).isEqualTo(expected);
    }
}