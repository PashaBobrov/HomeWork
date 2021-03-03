package HomeWork1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {
    private final Task7 converter = new Task7();

    @ParameterizedTest
    @MethodSource("dataProvider")
    void toBinaryString(String result, int value) {
        assertEquals(result, converter.toBinaryString((byte) value));
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of("00101010", 42),
                Arguments.of("00001111", 15),
                Arguments.of("11010110", -42),
                Arguments.of("11110001", -15)
        );
    }
}