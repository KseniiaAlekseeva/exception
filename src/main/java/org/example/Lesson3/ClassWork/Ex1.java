package org.example.Lesson3.ClassWork;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex1 {
    public static void main(String[] args) {
        Path pathToFolder = Path.of("/Users/kseniaalekseeva/Documents/");
        Path pathToFile = pathToFolder.resolve("test1.txt");
        Path pathToFile2 = pathToFolder.resolve("test2.txt");
        rwLine(pathToFile, pathToFile2);
    }

    public static void rwLine(Path pathRead, Path pathWrite) {
        try (BufferedReader in = Files.newBufferedReader(pathRead);
             BufferedWriter out = Files.newBufferedWriter(pathWrite)) {
            out.write(in.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
