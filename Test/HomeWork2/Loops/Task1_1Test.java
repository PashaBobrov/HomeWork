package HomeWork2.Loops;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task1_1Test {

    @ParameterizedTest
    @MethodSource("dataProvider")
    void recursion(int result, int value) {
        assertEquals(result, Task1_1.recursion(value));
    }
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of(120, 5),
                Arguments.of(24, 4),
                Arguments.of(6, 3)
        );
    }

}