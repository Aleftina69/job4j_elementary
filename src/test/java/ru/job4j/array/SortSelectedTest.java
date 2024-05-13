package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {9, 7, 8};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {7, 8, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort5() {
        int[] data = new int[] {13, 15, 12, 14, 16};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {12, 13, 14, 15, 16};
        assertThat(result).containsExactly(expected);
    }
}