package HomeWork1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {
    private final Task6 creatorPhone = new Task6();

    @ParameterizedTest
    @MethodSource("dataProvider")
    void createPhoneNumber(String result, char[] phone) {
        assertEquals(result,
                creatorPhone.createPhoneNumber(phone));
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.of("Не правильные входные параметры", new char[]{'3', '4', '3'}),
                Arguments.of("(123) 456-7890", new char[]{'1', '2', '3','4', '5', '6','7', '8', '9','0'}),
                Arguments.of("(123) 456-7890", new char[]{'1', '2', '3','4', '5', '6','7', '8', '9','0','1','2'})
        );
    }
}