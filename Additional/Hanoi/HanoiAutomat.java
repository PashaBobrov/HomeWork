package Additional.Hanoi;

public class HanoiAutomat extends Hanoi {

    public HanoiAutomat(int disks, int towers) {
        super(disks,towers);
    }

    private int getTower(int disk,int shift) {
        int result = -1;
        for (int iDisk =  0; iDisk < disks; iDisk++) {
            for (int jTower = 0; jTower < towers; jTower++) {
                if (field[iDisk][jTower] == disk) {
                    result = jTower + 1;
                }
            }
        }

        int bound = towers - 2;
        if (shift > 0) {
            int ost = (result + shift) % towers;
            if (ost > bound || ost == 1) {
                result = ost;
            } else if (ost == 0) {
                result += shift;
            } else {
                result += shift + bound - 1;
            }
        } else if(shift < 0) {
            if(result + shift  == 0) {
                result = towers;
            } else if (result + shift <= bound) {
                result = 1;
            } else {
                result += shift;
            }
        }
        return result;
    }

    @Override
    public void gamePlay() {
        printField();
        autoGame(disks,-1);
        System.out.print("Победа компьютера за " + getCountMove() + " ходов!");
    }


    public void autoGame(int disk, int shift) {

        if(disk == 0){
            return;
        }
        autoGame(disk-1, -shift);

        int towerFrom = getTower(disk,0);
        int towerTo = getTower(disk,shift);
        newMove(towerFrom,towerTo);
        printField();

        autoGame(disk-1, -shift);

    }
}
