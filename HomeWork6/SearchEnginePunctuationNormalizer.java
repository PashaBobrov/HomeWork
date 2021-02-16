package HomeWork6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {
    private ISearchEngine searchEngine;

    public SearchEnginePunctuationNormalizer(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    public long search(String text, String word) {
        text = text.replaceAll("[^Р-пр-џЈИ]+"," ");
        return searchEngine.search(text, word);

    }
}
