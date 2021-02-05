package Additional.Hanoi;

import Additional.Hanoi.Hanoi;

import java.util.Scanner;

public class HanoiMain {

    public static Hanoi getGameInstance(String strItemMenu) {
        Hanoi result = null;
        Scanner scanner = new Scanner(System.in);
        char chItem =(strItemMenu.toCharArray()[0]);
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
                return result;
        }

        return result;
    }
    public static String getStartItemMenu() {

        System.out.println("<1> Запустить игру. Играете вы.");
        System.out.println("<2> Запустить игру. Играет компьютер.");
        System.out.println("<3> Запустить игру. Играет компьютер(Но не знает правил).");
        System.out.println("<4> Загрузить сохраненную игру.");
        System.out.println("<5> Запустить сохраненную игру.");
        System.out.println("<Q> Вернуться в главное меню.");

        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        return result;

    }

    public static void main(String[] args) {
        boolean quit = false;
        while (!quit) {
            Hanoi hanoi = getGameInstance(getStartItemMenu());
            if(hanoi != null) {
                hanoi.gamePlay();
            } else {
                quit = true;
            }

        }
    }
}
