package Additional.Hanoi;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class HanoiMain {
    static IHanoi currentHanoi;

    public static IHanoi createGameInstance(char chItem) {
        IHanoi result = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дисков");
        int disks  = scanner.nextInt();
        System.out.println("Введите количество стержней");
        int towers  = scanner.nextInt();
        switch (chItem) {
            case('1'):
                result = new Hanoi(disks,towers);
                break;
            case('2'):
                result = new HanoiAutomat(disks,towers);
                break;
            case('3'):
                result = new HanoiAutomatStupid(disks,towers);
                break;
            default:
                return new Hanoi(disks,towers);
        }
        return result;
    }

    public static String getStartItemMenu() {

        System.out.println();
        System.out.println("<1> Запустить игру. Играете вы.");
        System.out.println("<2> Запустить игру. Играет компьютер.");
        System.out.println("<3> Запустить игру. Играет компьютер(Но не знает правил).");
        System.out.println("<4> Загрузить сохраненную игру и продолжить");
        System.out.println("<5> Запустить сохраненную игру.");
        System.out.println("<6> Сохранить игру.");
        System.out.println("<AnyKey> Выйти из игры.");

        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        return result;
    }

    public static void main(String[] args) throws IOException {
        IHanoi hanoi = null;
        boolean quit = false;
        while (!quit) {
            String strItem = getStartItemMenu();
            char chItem = (strItem.toCharArray()[0]);
            switch (chItem) {
                case('1'):
                case('2'):
                case('3'):
                    hanoi = createGameInstance(chItem);
                    if(hanoi != null) {
                        hanoi.gamePlay();
                        //TODO выход на середине игры
                    } else {
                        quit = true;
                    }
                    break;
                case('4'):
                    if (hanoi == null) {
                        hanoi = createGameInstance(chItem);
                    }
                    if (hanoi.loadGameFromFile(Paths.get(Hanoi.PATH_FAILE_GAME))) {
                        hanoi.gamePlay();
                    } else {
                        System.out.println("Нет данных для загрузки");
                    }
                    break;
                case('5'):
                    if (hanoi != null) {
                        if (hanoi == null) {
                            hanoi = createGameInstance(chItem);
                        }
                        if (!hanoi.loadGameFromFile(Paths.get(Hanoi.PATH_FAILE_GAME))) {
                            System.out.println("Нет данных для загрузки");
                        }
                    }
                    break;
                case('6'):
                    if (hanoi != null) {
                        hanoi.SaveGameToFile(Paths.get(Hanoi.PATH_FAILE_GAME));
                    }
                    break;
                default:
                    quit = true;
            }
        }
    }
}
