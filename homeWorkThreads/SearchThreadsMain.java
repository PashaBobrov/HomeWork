package homeWorkThreads;

import HomeWork6.EasySearch;
import HomeWork6.ISearchEngine;
import homeWorkFiles.dto.Book;
import homeWorkFiles.dto.LogFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class SearchThreadsMain {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        ExecutorService executorService = Executors.newCachedThreadPool();

        Scanner scanner = new Scanner(System.in);
        LogFile logFile = new LogFile("result.txt");
        ISearchEngine searchEngine = new EasySearch();

        List<Book> listBooks = new ArrayList<>();
        for (File file : new File(args[0]).listFiles()) {
            if(!file.isDirectory()) {
                listBooks.add(new Book(file.getAbsolutePath()));
                System.out.println(file.getAbsolutePath());
            }
        }

        Boolean flagEnd = false;
        do {
            System.out.print("Enter word to seach or 'quit':");
            String searchWord = scanner.nextLine();

            if (!searchWord.equals("quit")) {
                for (Book book : listBooks) {
                    executorService.submit(new TaskSeach(book,searchWord,logFile,new EasySearch()));
                }
                //listBooks.forEach(()-> {executorService.submit(new TaskSeach())});
            } else {
                flagEnd = true;
            }
        } while (!flagEnd);
        logFile.kill();
        //executorService.
        executorService.shutdown();
    }
}
