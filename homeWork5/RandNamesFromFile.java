package homeWork5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * ����� ��������� ��������� ����� �� �����. ��������� ��������� {@link IRandom}
 * ��������� ����������  {@link RandStringNames}
 * @autor ����� ������
 * @version 1.1
 */
public class RandNamesFromFile extends RandStringNames implements IRandom {
    /**
     * ����������, �������������� {@link RandStringNames#storageNames} �������� �� �����
     * @param path - ���� � �����
     */
    public RandNamesFromFile(Path path) throws IOException {
        String content = new String(Files.readAllBytes(path));
        content = content.replace(" ","");
        storageNames = content.split(",");
    }

}
