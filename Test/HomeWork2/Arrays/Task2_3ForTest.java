package HomeWork2.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2_3ForTest {
    public final IArraysOperation arraysOperation = new Task2_3For();

    @Test
    void printEachSecondFromArray() {
        AssertArrays.assertPrintEachSecondFromArray(arraysOperation);
    }

    @Test
    void printReversArray() {
        AssertArrays.assertPrintReversArray(arraysOperation);
    }

}