package homeWorkFiles.dto;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LogFile {
    private FileWriter writer;
    public LogFile(String dir) {
        try {
            FileWriter writer = new FileWriter(dir,new File(dir).exists());
            this.writer = writer;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void add(String val) {
        try {
            writer.write(val + "\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void kill() {
        try {
            writer.flush();
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}

