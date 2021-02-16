package HomeWork6;

import java.util.regex.Pattern;

public class SearchEngineIngoreCase implements ISearchEngine{
    private ISearchEngine searchEngine;

    public SearchEngineIngoreCase(ISearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }
    @Override
    public long search(String text, String word) {
        if (searchEngine instanceof RegExSearch) {
            ((RegExSearch) searchEngine).setFlags(Pattern.CASE_INSENSITIVE);
        } else {
            text = text.toLowerCase();
            word = word.toLowerCase();
        }
        return searchEngine.search(text,word);
    }
}
