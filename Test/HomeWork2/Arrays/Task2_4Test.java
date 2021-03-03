package HomeWork2.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2_4Test {

    @Test
    void getSumNumbersArray() {
        assertEquals(12,Task2_4.getSumNumbersArray(new int[] {0,1,22,3,4}));
    }

    @Test
    void getSumEvenPositivElementsArray() {
        assertEquals(26,Task2_4.getSumEvenPositivElementsArray(new int[] {0,1,22,3,4}));
    }

    @Test
    void getMaxElementArrayWithEvenIndex() {
        assertEquals(22,Task2_4.getMaxElementArrayWithEvenIndex(new int[] {0,1,22,3,4}));
    }

    @Test
    void getCompressArray() {
        assertArrayEquals(new int[] {0,22},Task2_4.getCompressArray(new int[] {0,1,22,3,4},1,21));
    }
}