package HomeWork2.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task2_3DoWhileTest {
    public final IArraysOperation arraysOperation = new Task2_3DoWhile();


    @Test
    void printEachSecondFromArray() {
        AssertArrays.assertPrintEachSecondFromArray(arraysOperation);
    }

    @Test
    void printReversArray() {
        AssertArrays.assertPrintReversArray(arraysOperation);
    }
}