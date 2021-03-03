package HomeWork2.Loops;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task1_2Test {

    @ParameterizedTest
    @MethodSource("dataProvider")
    void isNumberArr(boolean result,String value) {
        assertEquals(true, Task1_2.isNumberArr("1112323"));
        assertEquals(false, Task1_2.isNumberArr("11err23"));
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of(true, "123247"),
                Arguments.of(false, "11err23")
        );
    }
}