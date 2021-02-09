package Additional.Hanoi;

import java.io.IOException;
import java.nio.file.Path;

public interface IHanoi {
    public void gamePlay();
    public boolean loadGameFromFile(Path path) throws IOException;
    public void SaveGameToFile(Path path) throws IOException;
}
