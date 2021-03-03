package HomeWork6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SearchEngineIngoreCaseTest {
    private final ISearchEngine searchEngine = new SearchEngineIngoreCase(new EasySearch());
    @ParameterizedTest
    @MethodSource("dataProvider")
    void search(String text, String word, int count) {
        assertEquals(count,searchEngine.search(text,word));
    }


    static Stream<Arguments> dataProvider() {
        String textSearch = "Карл у Клары украл коралы, Клара у Карла украла клорнет.";
        return Stream.of(
                Arguments.of(textSearch, "клорнет", 1),
                Arguments.of(textSearch, "КАРЛА", 1),
                Arguments.of(textSearch, "карл", 1),
                Arguments.of(textSearch, "корал", 0),
                Arguments.of(textSearch, "клары", 1),
                Arguments.of(textSearch, "украл", 1),
                Arguments.of(textSearch, "клорнет", 1)
        );
    }

}