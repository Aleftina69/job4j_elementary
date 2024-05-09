package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import ru.job4j.condition.ThreeMax;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {
    @Test
    void whenStart7Finish23Sum255() {
        int start = 7;
        int finish = 23;
        int result = Counter.sum(start, finish);
        int expected = 255;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenStart18Finish5Sum0() {
        int start = 18;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}