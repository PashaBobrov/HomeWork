package Additional.Hanoi;

/*
Задача на умение работать с: Циклами, Массивами, Методами, Консолью, Условиями, Абстрактные классы*, Наследование*, Интерфейсы*, Файлами**.

Ханойские башни:
!!!ВНИМАНИЕ!!! не пытайтесь делать сразу автоматический режим игры, начинайте именно с ручного.
Не надо делать НИКАКИХ РЕКУРСИЙ. Иначе закопаетесь в этой домашке и слезах
В идеале написать код таким образом чтобы код ручного режима можно было переиспользовать в автоматическом режиме. Тогда можно будет применить интерфейсы, абстрактные классы, наследование

0. Правила и методы игры https://ru.wikipedia.org/wiki/%D0%A5%D0%B0%D0%BD%D0%BE%D0%B9%D1%81%D0%BA%D0%B0%D1%8F_%D0%B1%D0%B0%D1%88%D0%BD%D1%8F
1. Пример игры https://ru.goobix.com/%D0%B8%D0%B3%D1%80%D1%8B-%D0%BE%D0%BD%D0%BB%D0%B0%D0%B9%D0%BD/%D1%85%D0%B0%D0%BD%D0%BE%D0%B9%D1%81%D0%BA%D0%B0%D1%8F-%D0%B1%D0%B0%D1%88%D0%BD%D1%8F/
2. Есть два режима игры:
	2.1 Ручной. В данном режиме пользователь указывает какой элемент и куда он передвигает
	2.2* Автоматический. Пользователь наблюдает за каждым шагом самостоятельной игры компьютера
3. На старте пользователю предлагают выбрать режим игры. С клавиатуры он выбирает режим. 1 - ручной, 2 - автоматический
4. Дать возможность указать количество колец с которыми мы будет играть. Минимальное - 3, максимальное - 8
5. Игровое поле в памяти приложения предлагается хранить в массиве int[][], где число > 0 это кольцо определённого размера, 0 - это пустое место на стержне
6. Игровое поле в консоли отображает немного по другому. Цифра - это кольцо определённого размера, * - это пустое место на стержне. Пример: Если пользователь выберет что он будет играть с 4-мя кольцами то стартовое поле в консоли будет выглядеть следующим образом:
	1 * *
	2 * *
	3 * *
	4 * *
7. В ручном режиме игры пользователь должен выбрать откуда и куда он будет перемещать кольцо, либо на любом ходе может выйти из игры не закончив её.
8. После выбора пользователя вы должны проверить можно ли переместить выбранное кольцо на выбранный стержень.
9. Если переместить можно то в консоли должно отобраться новое поле и предложение о выборе следующего кода. Пример:
Было:
	1 * *
	2 * *
	3 * *
	4 * *
Пользователь выбрал ход 1->3. Значит требуется переместить верхнее кольцо на первом стержне на третий стержень. Такой ход возможен - перемещаем:
	* * *
	2 * *
	3 * *
	4 * 1
10. Если переместить нельзя то необходимо выдать сообщение о невозможности хода и снова предложить выбрать ход. Пример:
Было:
	* * *
	2 * *
	3 * *
	4 * 1
Пользователь выбрал ход 1->3. Значит требуется переместить верхнее кольцо на первом стержне на третий стержень.
Такой ход не возможен, так как кольцо большего размера не может быть помещено на стержень с кольцом меньшего размера (кольцо 2 на стержень 3 с кольцом 1). Выводим сообщение: К сожалению данный ход не возможен правилами игры, выберите другой ход.
11. При успешном завершении игры необходимо выводить поздравление и выводить количество ходов которые совершил пользователь\компьютер
12.* В автоматическом режиме может быть две реализации:
	12.1* Компьютер знает правила и сразу знает что куда перемещать и не делает неправильные ходы
	12.2** Компьютер не знает правила и как пользователь может совершать ошибки
13.* В автоматическом режиме после каждого хода компьютера должно выводиться получившееся поле (как при игре в ручном режиме)
14.* В 7 пункте указано что пользователь на любом ходе может завершить игру. При завершении игры предложить пользователю сохранить текущую игру и указать имя сохранения.
15.** По завершению ручной игры предложить сохранить прохождение игры.
16.** При запуске ручного режима игры предложить выбрать из двух пунктов. 1 - новая игра, 2 - загрузить сохранённую игру, 3 - запустить пройденную игру.
	16.1 Новая игра начинает игру с самого начала. Спасибо кэп.
	16.2 Загрузить сохранённую игру - загружаем незавершенную игру для продолжения игры
	16.3 Запустить пройденную игру - загружаем пройденную игру для отображения процесса уже сыгранной игры.
17.* Дать возможность указать большее количество колец - до 20. Также дать возможность выбора количества стержней - до 8

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hanoi {
    protected int[][] field;
    protected List<int[]> savedGame = new ArrayList<int[]>();
    private boolean replayMode;

    public Hanoi(int disks, int towers) {
        this.field = new int[disks][towers];
        initiolizeField();

    }
    private void initiolizeField() {
        for (int iDisk = 0; iDisk < field.length; iDisk++) {
            for (int jTower = 0; jTower < field[iDisk].length; jTower++) {
                field[iDisk][jTower] = (jTower == 0) ? field.length - iDisk : 0;
            }
        }
    }

    private boolean isReplayMode() {
        return replayMode;
    }

    private void setReplayMode(boolean on_off) {
        replayMode = on_off;
    }


    public int getCountMove() {
        return savedGame.size();
    }

    public boolean newMove(int towerFrom, int towerTo) {

        int indexTowerFrom = towerFrom - 1;
        int indexTowerTo = towerTo - 1;
        int indexDiskFrom = -1;

        //Берем верхний диск
        for (int iDisk = field.length-1; iDisk >= 0; iDisk--) {
            if (field[iDisk][indexTowerFrom] != 0) {
                indexDiskFrom = iDisk;
                break;
            }
        }

        if (indexDiskFrom == -1){
            //дисков нет
            return false;
        }
        //Ставим найденный диск
        for (int iDisk = 0; iDisk < field.length; iDisk++) {
            if(field[iDisk][indexTowerTo] == 0){
                field[iDisk][indexTowerTo] = field[indexDiskFrom][indexTowerFrom];
                field[indexDiskFrom][indexTowerFrom] = 0;
                break;
            } else if (field[iDisk][indexTowerTo] < field[indexDiskFrom][indexTowerFrom]) {
                //нельзя положить на меньший диск
                return  false;
            }
        }

        if (!isReplayMode()) {
            saveGame(towerFrom, towerTo);
        }
        return true;
    }

    private void saveGame(int towerFrom, int towerTo){
        int[] move = {towerFrom,towerTo};
        savedGame.add(move);
    }

    public boolean isWin() {

        for (int iDisk = 0; iDisk < field.length; iDisk++) {
            if(this.field[iDisk][field[iDisk].length-1] != field.length - iDisk){
                return false;
            }
        }

        return true;
    }


    public void printField() {
        System.out.println("");
        for (int iDisk = field.length - 1; iDisk >= 0; iDisk--) {
            String strField = "";
            for (int jTower = 0; jTower < field[iDisk].length; jTower++) {
                strField += field[iDisk][jTower];
            }
            System.out.println(strField.replace("0","*"));
        }
    }

    public void printSavedGame() {
        initiolizeField();
        printField();
        setReplayMode(true);
        for (int[] move: savedGame) {
            newMove(move[0], move[1]);
            printField();
        }
        setReplayMode(false);
    }

    public void gamePlay() {
        Scanner scanner = new Scanner(System.in);
        boolean gameover = false;
        do {
            printField();

            System.out.print("Введите стержень откуда--> ");
            int tower  = scanner.nextInt();
            System.out.print("Введите стержень куда  --> ");
            int newTower  = scanner.nextInt();

            if (newMove(tower,newTower)) {
                gameover = isWin();
                if (gameover){
                    System.out.print("Поздравляю это победа за " + getCountMove() + " ходов!");
                    //printSavedGame();
                }
            } else {
                System.out.print("Не правильный ход");
            }
        } while (!gameover);
    }



}
