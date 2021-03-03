package HomeWork2.Sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {
    @Test
    void bubbleSort() {
        int[] container = {1,2,3,4,6,6,7};
        Sorting.bubbleSort(container);
        assertArrayEquals(new int[] {1,2,3,4,6,6,7},container);
    }

    @Test
    void shakerSort() {
        int[] container = {1,2,3,4,6,6,7};
        Sorting.shakerSort(container);
        assertArrayEquals(new int[] {1,2,3,4,6,6,7},container);
    }
}