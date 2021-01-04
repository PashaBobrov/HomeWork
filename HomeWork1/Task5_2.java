package HomeWork1;

import java.util.Objects;

public class Task5_2 {
    public static void main(String[] args) {
        String name = "";

        if (args.length > 0) {
            name = args[0];
        }
        if (Objects.equals(name,"Вася")) {
            System.out.println("Привет\n" + "Я тебя так долго ждал");
        }else if(Objects.equals(name,"Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
