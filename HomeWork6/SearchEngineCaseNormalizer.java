package HomeWork6;

import Additional.Hanoi.Hanoi;
import Additional.Hanoi.HanoiAutomat;
import Additional.Hanoi.HanoiAutomatStupid;

public class SearchEngineCaseNormalizer implements ISearchEngine {
    private String caseRegEx;
    private ISearchEngine searchEngine;

    public SearchEngineCaseNormalizer(ISearchEngine searchEngine, String caseRegEx) {
        this.caseRegEx = caseRegEx;
        this.searchEngine = searchEngine;
    }

    @Override
    public long search(String text, String word) {
        String wordWithoutCase = word.replaceAll("[" + caseRegEx + "]$","");
        text = text.replaceAll(wordWithoutCase+"[" + caseRegEx + "]",word);
        return searchEngine.search(text,word);
    }
}
