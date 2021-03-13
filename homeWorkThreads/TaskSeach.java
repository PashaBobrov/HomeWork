package homeWorkThreads;

import HomeWork6.ISearchEngine;
import homeWorkFiles.dto.Book;
import homeWorkFiles.dto.LogFile;

import java.io.File;

public class TaskSeach implements Runnable{
    private Book book;
    private String searchWord;
    private LogFile logFile;
    private ISearchEngine searchEngine;

    public TaskSeach(Book book, String searchWord, LogFile logFile, ISearchEngine searchEngine) {
        this.book = book;
        this.searchWord = searchWord;
        this.logFile = logFile;
        this.searchEngine = searchEngine;
    }

    @Override
    public void run() {
        long count = searchEngine.search(book.getText(),searchWord);
        logFile.add(book.getDir() + " " + searchWord + " " + count);
    }
}
