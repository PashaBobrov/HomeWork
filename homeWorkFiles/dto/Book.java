package homeWorkFiles.dto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Book {
    private String text;
    public Book(String dir) {
        try {
            this.text = new String(Files.readAllBytes(Path.of(dir)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getText() {
        return text;
    }
}
