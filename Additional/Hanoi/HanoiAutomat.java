package Additional.Hanoi;

public class HanoiAutomat extends Hanoi {

    public HanoiAutomat(int disks, int towers) {
        super(disks,towers);
    }

    private int getTower(int disk,int shift) {
        int result = -1;
        for (int iDisk =  0; iDisk < field.length; iDisk++) {
            for (int jTower = 0; jTower < field[iDisk].length; jTower++) {
                if (field[iDisk][jTower] == disk) {
                    result = jTower + 1;
                }
            }
        }

        int bound = field[0].length - 2;
        if (shift > 0) {
            int ost = (result + shift) % field[0].length;
            if (ost > bound || ost == 1) {
                result = ost;
            } else if (ost == 0) {
                result += shift;
            } else {
                result += shift + bound - 1;
            }
        } else if(shift < 0) {
            if(result + shift  == 0) {
                result = field[0].length;
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
        autoGame(field.length,-1);
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
