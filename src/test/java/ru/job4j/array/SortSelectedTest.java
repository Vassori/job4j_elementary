package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    public void whenSortArray5Elements() {
        int[] data = {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArray3Elements() {
        int[] data = new int[] {7, 0, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 3, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortArray5Elements2() {
        int[] data = new int[] {3, 1, 7, 1, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 1, 3, 3, 7};
        assertThat(result).containsExactly(expected);
    }
}