package HomeWork1;

import HomeWork1.API.ICommunicationPrinter;

import java.util.Objects;

public class Task5_2 implements ICommunicationPrinter {

    @Override
    public String welcom(String name) {
        if (Objects.equals(name,"Вася")) {
            return "Привет\n" + "Я тебя так долго ждал";
        } else if (Objects.equals(name,"Анастасия")) {
            return "Я тебя так долго ждал";

        } else {
            return "Добрый день, а вы кто?";
        }
    }
}
