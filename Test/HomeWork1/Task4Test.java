package HomeWork1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @ParameterizedTest
    @MethodSource("dataProvider")
    void sleepIn(boolean weekday,boolean vacation,boolean result) {
        assertEquals(result,Task4.sleepIn(weekday,vacation));
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of(true, true, true),
                Arguments.of(false, true, true),
                Arguments.of(true, false, false),
                Arguments.of(false, false, true)
        );
    }
}