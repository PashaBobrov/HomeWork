package HomeWork2.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2_3WhileTest {
    public final IArraysOperation arraysOperation = new Task2_3While();

    @Test
    void printEachSecondFromArray() {
        AssertArrays.assertPrintEachSecondFromArray(arraysOperation);
    }

    @Test
    void printReversArray() {
        AssertArrays.assertPrintReversArray(arraysOperation);
    }

}