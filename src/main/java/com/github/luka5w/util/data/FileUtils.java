package com.github.luka5w.util.data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {

    public static void erase(File file) throws IOException {
        if (!file.isFile()) throw new FileNotFoundException("file not found");
        file.delete();
        file.createNewFile();
    }
    public static void write(File file, String content) throws IOException {
        FileWriter fileWriter = new FileWriter(file.getPath());
        fileWriter.write(content);
        fileWriter.close();
    }
}
