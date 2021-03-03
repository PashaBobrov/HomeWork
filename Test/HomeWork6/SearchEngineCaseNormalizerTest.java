package HomeWork6;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SearchEngineCaseNormalizerTest {
    private final ISearchEngine searchEngine = new SearchEngineCaseNormalizer(new RegExSearch(),"аяеуы");

    @ParameterizedTest
    @MethodSource("dataProvider")
    void search(String text, String word, int count) {
        assertEquals(count,searchEngine.search(text,word));
    }


    static Stream<Arguments> dataProvider() {
        String textSearch = "Карл у Клары украл коралы, Клара у Карла украла клорнет.";
        return Stream.of(
                Arguments.of(textSearch, "клорнет", 1),
                Arguments.of(textSearch, "Карла", 1),
                Arguments.of(textSearch, "Клар", 2 ),
                Arguments.of(textSearch, "Карл", 2 ),
                Arguments.of(textSearch, "корал", 1),
                Arguments.of(textSearch, "Клары", 1),
                Arguments.of(textSearch, "украл", 2),
                Arguments.of(textSearch, "колоры", 0),
                Arguments.of(textSearch, "клорнет", 1)
        );
    }

}