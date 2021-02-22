package Additional.Hanoi;

import java.io.IOException;
import java.nio.file.Path;

public interface IHanoi {
    public void gamePlay();
    public void printGame();
    public void SaveGameToFile(Path path) throws IOException;
}
