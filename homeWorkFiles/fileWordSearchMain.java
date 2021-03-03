package homeWorkFiles;

/**
 * Далее задания выполнять только после прохождения темы "Работа с файлами"
 * 7. Написать новый класс с точкой входа. При запуске программы пользователь должен передать
 * адрес папки, из которой мы будет считывать текстовые файлы.
 * Наполнить данную директорию книгами, 100 книг мнинимум. При запуске пользователю в консоль
 * выдать список txt файлов и предложить выбрать текст, с которым мы будем работать.
 * Пользователь, выбрав текст вводит то, что он хочет найти в этом тексте.
 * После каждого ввода осуществляется поиск. Вводит пока не надоест.
 * Результат всех его поисков должен накапливаться в файла result.txt в формате «Имя файла –
 * слово – количество»
 */


import HomeWork6.EasySearch;
import HomeWork6.ISearchEngine;
import homeWorkFiles.dto.*;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class fileWordSearchMain {

    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> listBooks = getListFiles(args[0]);
        LogFile logFile = new LogFile("result.txt");
        ISearchEngine searchEngine = new EasySearch();

        Boolean flagEnd = false;
        do {
            printList(listBooks);

            System.out.print("Choose number of book:");
            String number = scanner.nextLine();
            System.out.print("Enter word to find:");
            String findWord = scanner.nextLine();

            if (listBooks.containsKey(Integer.valueOf(number))) {
                String dirBook = listBooks.get(Integer.valueOf(number));
                Book book = new Book(dirBook);
                long count = searchEngine.search(book.getText(),findWord);
                logFile.add(dirBook + " " + findWord + " " + count);
            } else {
                flagEnd = true;
            }
        } while (!flagEnd);
        logFile.kill();
    }

    public static void printList(Map<Integer, String> list) {
        for (Map.Entry<Integer,String> entry :list.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        };
    }

    public static Map<Integer, String> getListFiles(String dir) {
        Map<Integer, String> result = new HashMap<>();
        File dirFile = new File(dir);
        File[] listFiles = dirFile.listFiles();
        int i = 0;
        if (listFiles != null) {
            for (File file : listFiles) {
               result.put(++i, file.getAbsolutePath());
            }
        }
        return result;
    }
}

