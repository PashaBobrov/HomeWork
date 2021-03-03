package HomeWork2.Arrays;

import HomeWork1.API.ICommunicationPrinter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AssertArrays {

    static void assertPrintReversArray(IArraysOperation arraysOperation) {
        assertArrayEquals(new int[] {4,3,2,1,0}, arraysOperation.printReversArray(new int[] {0,1,2,3,4}));
    }
    static void assertPrintEachSecondFromArray(IArraysOperation arraysOperation) {
        assertArrayEquals(new int[] {1,3}, arraysOperation.printEachSecondFromArray(new int[] {0,1,2,3,4}));
    }

}
