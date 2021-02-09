package Additional.Hanoi;

/*
������ �� ������ �������� �: �������, ���������, ��������, ��������, ���������, ����������� ������*, ������������*, ����������*, �������**.

��������� �����:
!!!��������!!! �� ��������� ������ ����� �������������� ����� ����, ��������� ������ � �������.
�� ���� ������ ������� ��������. ����� ����������� � ���� ������� � ������
� ������ �������� ��� ����� ������� ����� ��� ������� ������ ����� ���� ���������������� � �������������� ������. ����� ����� ����� ��������� ����������, ����������� ������, ������������

0. ������� � ������ ���� https://ru.wikipedia.org/wiki/%D0%A5%D0%B0%D0%BD%D0%BE%D0%B9%D1%81%D0%BA%D0%B0%D1%8F_%D0%B1%D0%B0%D1%88%D0%BD%D1%8F
1. ������ ���� https://ru.goobix.com/%D0%B8%D0%B3%D1%80%D1%8B-%D0%BE%D0%BD%D0%BB%D0%B0%D0%B9%D0%BD/%D1%85%D0%B0%D0%BD%D0%BE%D0%B9%D1%81%D0%BA%D0%B0%D1%8F-%D0%B1%D0%B0%D1%88%D0%BD%D1%8F/
2. ���� ��� ������ ����:
	2.1 ������. � ������ ������ ������������ ��������� ����� ������� � ���� �� �����������
	2.2* ��������������. ������������ ��������� �� ������ ����� ��������������� ���� ����������
3. �� ������ ������������ ���������� ������� ����� ����. � ���������� �� �������� �����. 1 - ������, 2 - ��������������
4. ���� ����������� ������� ���������� ����� � �������� �� ����� ������. ����������� - 3, ������������ - 8
5. ������� ���� � ������ ���������� ������������ ������� � ������� int[][], ��� ����� > 0 ��� ������ ������������ �������, 0 - ��� ������ ����� �� �������
6. ������� ���� � ������� ���������� ������� �� �������. ����� - ��� ������ ������������ �������, * - ��� ������ ����� �� �������. ������: ���� ������������ ������� ��� �� ����� ������ � 4-�� �������� �� ��������� ���� � ������� ����� ��������� ��������� �������:
	1 * *
	2 * *
	3 * *
	4 * *
7. � ������ ������ ���� ������������ ������ ������� ������ � ���� �� ����� ���������� ������, ���� �� ����� ���� ����� ����� �� ���� �� �������� �.
8. ����� ������ ������������ �� ������ ��������� ����� �� ����������� ��������� ������ �� ��������� ��������.
9. ���� ����������� ����� �� � ������� ������ ���������� ����� ���� � ����������� � ������ ���������� ����. ������:
����:
	1 * *
	2 * *
	3 * *
	4 * *
������������ ������ ��� 1->3. ������ ��������� ����������� ������� ������ �� ������ ������� �� ������ ��������. ����� ��� �������� - ����������:
	* * *
	2 * *
	3 * *
	4 * 1
10. ���� ����������� ������ �� ���������� ������ ��������� � ������������� ���� � ����� ���������� ������� ���. ������:
����:
	* * *
	2 * *
	3 * *
	4 * 1
������������ ������ ��� 1->3. ������ ��������� ����������� ������� ������ �� ������ ������� �� ������ ��������.
����� ��� �� ��������, ��� ��� ������ �������� ������� �� ����� ���� �������� �� �������� � ������� �������� ������� (������ 2 �� �������� 3 � ������� 1). ������� ���������: � ��������� ������ ��� �� �������� ��������� ����, �������� ������ ���.
11. ��� �������� ���������� ���� ���������� �������� ������������ � �������� ���������� ����� ������� �������� ������������\���������
12.* � �������������� ������ ����� ���� ��� ����������:
	12.1* ��������� ����� ������� � ����� ����� ��� ���� ���������� � �� ������ ������������ ����
	12.2** ��������� �� ����� ������� � ��� ������������ ����� ��������� ������
13.* � �������������� ������ ����� ������� ���� ���������� ������ ���������� ������������ ���� (��� ��� ���� � ������ ������)
14.* � 7 ������ ������� ��� ������������ �� ����� ���� ����� ��������� ����. ��� ���������� ���� ���������� ������������ ��������� ������� ���� � ������� ��� ����������.
15.** �� ���������� ������ ���� ���������� ��������� ����������� ����.
16.** ��� ������� ������� ������ ���� ���������� ������� �� ���� �������. 1 - ����� ����, 2 - ��������� ���������� ����, 3 - ��������� ���������� ����.
	16.1 ����� ���� �������� ���� � ������ ������. ������� ���.
	16.2 ��������� ���������� ���� - ��������� ������������� ���� ��� ����������� ����
	16.3 ��������� ���������� ���� - ��������� ���������� ���� ��� ����������� �������� ��� ��������� ����.
17.* ���� ����������� ������� ������� ���������� ����� - �� 20. ����� ���� ����������� ������ ���������� �������� - �� 8

 */

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hanoi implements IHanoi {
    public static final String PATH_FAILE_GAME = "savedgame.txt";
    protected int[][] field;
    protected int disks;
    protected int towers;
    protected List<int[]> savedGame = new ArrayList<int[]>();
    private boolean replayMode;

    public Hanoi(int disks, int towers) {
        this.disks = disks;
        this.towers = towers;
        this.field = new int[disks][towers];
        initiolizeField();

    }
    private void initiolizeField() {
        for (int iDisk = 0; iDisk < disks; iDisk++) {
            for (int jTower = 0; jTower < towers; jTower++) {
                field[iDisk][jTower] = (jTower == 0) ? disks - iDisk : 0;
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

    public boolean loadGameFromFile(Path path) throws IOException {
        savedGame.clear();
        String contentFile = new String(Files.readAllBytes(path));
        String arrSplitMove[] = contentFile.split(";");
        for (String val: arrSplitMove) {
            String[] arrMove = val.split(",");
            int[] move = {Integer.valueOf(arrMove[0]),Integer.valueOf(arrMove[1])};
            savedGame.add(move);
        }
        return (savedGame.size() > 0);
    }

    public void SaveGameToFile(Path path) throws IOException {
        FileWriter myWriter = new FileWriter(path.toString());
        for (int[] move: savedGame) {
            myWriter.write(String.valueOf(move[0]) + "," + String.valueOf(move[1]) + ";");
        }
        myWriter.close();
    }

    public boolean newMove(int towerFrom, int towerTo) {

        int indexTowerFrom = towerFrom - 1;
        int indexTowerTo = towerTo - 1;
        int indexDiskFrom = -1;

        //����� ������� ����
        for (int iDisk = disks-1; iDisk >= 0; iDisk--) {
            if (field[iDisk][indexTowerFrom] != 0) {
                indexDiskFrom = iDisk;
                break;
            }
        }

        if (indexDiskFrom == -1){
            //������ ���
            return false;
        }
        //������ ��������� ����
        for (int iDisk = 0; iDisk < disks; iDisk++) {
            if(field[iDisk][indexTowerTo] == 0){
                field[iDisk][indexTowerTo] = field[indexDiskFrom][indexTowerFrom];
                field[indexDiskFrom][indexTowerFrom] = 0;
                break;
            } else if (field[iDisk][indexTowerTo] < field[indexDiskFrom][indexTowerFrom]) {
                //������ �������� �� ������� ����
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

        for (int iDisk = 0; iDisk < disks; iDisk++) {
            if(this.field[iDisk][towers-1] != disks - iDisk){
                return false;
            }
        }

        return true;
    }

    public void printField() {
        System.out.println("");
        for (int iDisk = disks - 1; iDisk >= 0; iDisk--) {
            String strField = "";
            for (int jTower = 0; jTower < towers; jTower++) {
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

            System.out.print("������� �������� ������--> ");
            int tower  = scanner.nextInt();
            System.out.print("������� �������� ����  --> ");
            int newTower  = scanner.nextInt();

            if (newMove(tower,newTower)) {
                gameover = isWin();
                if (gameover){
                    printField();
                    System.out.print("���������� ��� ������ �� " + getCountMove() + " �����!");
                }
            } else {
                System.out.print("�� ���������� ���");
            }
        } while (!gameover);
    }
}
