package Additional.Hanoi;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HanoiMain {
    public static IHanoi createGameInstance(ItemsGameMenu itemGameMenu) throws IOException {
        IHanoi result = null;
        if(itemGameMenu == ItemsGameMenu.QUITGAME || itemGameMenu == ItemsGameMenu.SAVEGAME) {
            return result;
        }
        Map<String,Integer> params = getParamsGame();
        int disks = params.get("disks");
        int towers = params.get("towers");
        if (itemGameMenu == ItemsGameMenu.COMPUTERGAME) {
            result = new HanoiAutomat(disks,towers);
        } else if (itemGameMenu == ItemsGameMenu.STUPEDCOMPUTERGAME) {
            result = new HanoiAutomatStupid(disks,towers);
        } else if (itemGameMenu == ItemsGameMenu.LOADCONTINUE
                || itemGameMenu == ItemsGameMenu.LOADGAME) {
            result = new Hanoi(Paths.get(Hanoi.PATH_FAILE_GAME));
        } else {
            result = new Hanoi(disks,towers);
        }
        return result;
    }

    public static Map<String,Integer> getParamsGame() {
        Map<String,Integer> result = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дисков");
        int disks  = scanner.nextInt();
        System.out.println("Введите количество стержней");
        int towers  = scanner.nextInt();
        result.put("disks",disks);
        result.put("towers",towers);
        return result;
    }
    public static ItemsGameMenu getStartItemMenu() {

        System.out.println();
        System.out.println("<1> Запустить игру. Играете вы");
        System.out.println("<2> Запустить игру. Играет компьютер.");
        System.out.println("<3> Запустить игру. Играет компьютер(Но не знает правил).");
        System.out.println("<4> Загрузить сохраненную игру и продолжить");
        System.out.println("<5> Запустить сохраненную игру.");
        System.out.println("<6> Сохранить игру.");
        System.out.println("<AnyKey> Выйти из игры.");

        Scanner scanner = new Scanner(System.in);
        String strItem = scanner.nextLine();
        return ItemsGameMenu.get(strItem.toCharArray()[0]);
    }

    public static void main(String[] args) throws IOException {
        IHanoi hanoi = null;
        boolean quit = false;
        while (!quit) {
            ItemsGameMenu itemGameMenu = getStartItemMenu();
            switch (itemGameMenu) {
                case LOADGAME:
                    hanoi = createGameInstance(itemGameMenu);
                    break;
                case SAVEGAME:
                    //TODO сохранять размеры поля
                    if (hanoi != null) {
                        hanoi.SaveGameToFile(Paths.get(Hanoi.PATH_FAILE_GAME));
                    }
                    break;
                case QUITGAME:
                    quit = true;
                    break;
                default:
                    //TODO выход на середине игры
                    hanoi = createGameInstance(itemGameMenu);
                    hanoi.gamePlay();
            }
        }
    }
}

enum ItemsGameMenu{
    SOLOGAME('1'),
    COMPUTERGAME('2'),
    STUPEDCOMPUTERGAME('3'),
    LOADCONTINUE('4'),
    LOADGAME('5'),
    SAVEGAME('6'),
    QUITGAME(' ');

    private char key;
    ItemsGameMenu(char key) {this.key = key;};
    public char getKey() {
        return key;
    }

    public static ItemsGameMenu get(char key) {
        ItemsGameMenu[] items = ItemsGameMenu.values();
        for (ItemsGameMenu item : items) {
            if (item.key == key) {
                return item;
            }
        }
        return QUITGAME;
    }
}
