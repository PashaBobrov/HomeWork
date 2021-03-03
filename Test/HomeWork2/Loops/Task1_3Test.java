package HomeWork2.Loops;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task1_3Test {

    @ParameterizedTest
    @MethodSource("dataProvider")
    void pow(double result,double value, int dgr) {
        assertEquals(result, Task1_3.pow(value,dgr));
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of(1889568, 18,5),
                Arguments.of(56.25, 7.5,2)
        );
    }
}