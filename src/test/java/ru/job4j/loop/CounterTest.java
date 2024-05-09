package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class CounterTest {
    @Test
    void whenSumNumbersFrom7To23Then255() {
        int start = 7;
        int finish = 23;
        int result = Counter.sum(start, finish);
        int expected = 255;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersStart18Finish5Then0() {
        int start = 18;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom3To8Then18() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }
}