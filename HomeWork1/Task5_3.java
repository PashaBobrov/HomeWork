package HomeWork1;

import HomeWork1.API.ICommunicationPrinter;

import java.util.Objects;

public class Task5_3 implements ICommunicationPrinter {
    @Override
    public String welcom(String name) {
        switch (name){
            case "Вася":
                return "Привет\n" + "Я тебя так долго ждал";
            case "Анастасия":
                return "Я тебя так долго ждал";
            default:
                return "Добрый день, а вы кто?";
        }
    }
}
