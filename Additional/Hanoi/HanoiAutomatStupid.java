package Additional.Hanoi;

import java.util.Random;

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
                    printField();
                    System.out.print("Победа компьютера за " + getCountMove() + " ходов!");
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
            result = random.nextInt(towers) + 1;
        } while (result == prevTower);

        return result;

    }
}
