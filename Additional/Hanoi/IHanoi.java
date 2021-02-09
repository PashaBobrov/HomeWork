package Additional.Hanoi;

import java.io.IOException;
import java.nio.file.Path;

public interface IHanoi {
    public int getCountMove();
    public boolean newMove(int towerFrom, int towerTo);
    public boolean isWin();
    public void printField();
    public void printSavedGame();
    public void gamePlay();
    public boolean loadGameFromFile(Path path) throws IOException;
    public void SaveGameToFile(Path path) throws IOException;
}
