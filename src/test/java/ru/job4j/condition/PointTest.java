package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to02then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when05to50then7dot07() {
        double expected = 7.07;
        Point a = new Point(0, 5);
        Point b = new Point(5, 0);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when73to48then5dot83() {
        double expected = 5.83;
        Point a = new Point(7, 3);
        Point b = new Point(4, 8);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus22to56then8dot06() {
        double expected = 8.06;
        Point a = new Point(-2, 2);
        Point b = new Point(5, 6);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when123to456then4dot24() {
        double expected = 4.24;
        Point a = new Point(1, 2, 3);
        Point b = new Point(4, 5, 6);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when003to509then5() {
        double expected = 5;
        Point a = new Point(0, 0, 3);
        Point b = new Point(5, 0, 9);
        double output = a.distance(b);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}