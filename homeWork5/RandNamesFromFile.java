package homeWork5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Класс генерации рандомных строк из файла. реализует интерфейс {@link IRandom}
 * Расширяет реализацию  {@link RandStringNames}
 * @autor Павел Бобров
 * @version 1.1
 */
public class RandNamesFromFile extends RandStringNames implements IRandom {
    /**
     * Коструктор, инициализирует {@link RandStringNames#storageNames} строками из файла
     * @param path - путь к файлу
     */
    public RandNamesFromFile(Path path) throws IOException {
        String content = new String(Files.readAllBytes(path));
        content = content.replace(" ","");
        storageNames = content.split(",");
    }

}
