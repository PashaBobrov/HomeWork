package Additional.Hanoi;

import java.util.Random;
import java.util.Scanner;

public class HanoiAutomatStupid extends HanoiAutomat {
    public HanoiAutomatStupid(int disks, int towers) {
        super(disks,towers);
    }
    @Override
    public void gamePlay() {
        int tower = 0;
        int newTower = 0;
        boolean gameover = false;
        do {
            printField();

            System.out.print("Введите стержень откуда--> ");
            tower  = getRandTower(newTower);
            System.out.println(tower);
            System.out.print("Введите стержень куда  --> ");
            newTower = getRandTower(tower);
            System.out.println(newTower);

            if (newMove(tower,newTower)) {
                gameover = isWin();
                if (gameover){
                    System.out.print("Поздравляю это победа за " + getCountMove() + " ходов!");
                    printField();
                    //printSavedGame();
                }
            } else {
                tower = 0;
                newTower = 0;
                System.out.print("Не правильный ход");
            }
        } while (!gameover);
    }

    private int getRandTower(int prevTower) {

        int result;
        Random random = new Random();
        do {
            result = random.nextInt(field[0].length) + 1;
        } while (result == prevTower);

        return result;

    }
}
