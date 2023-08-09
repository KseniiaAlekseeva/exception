package org.example.Lesson2.ClassWork;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        try {
            Map<String, String> map = readFile("test.txt");
            replaceText(map);
            saveToFile(map, "/s/s/test2.txt");
        } catch (ReadFileEx | SaveFileEx e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("Error in format!");
            System.out.println(e.getMessage());
        }
    }

    private static void saveToFile(Map<String, String> map, String filePath) throws SaveFileEx {
        try (FileWriter writer = new FileWriter(filePath)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                writer.write(entry.toString());
                writer.write("\n");
                writer.flush();
            }
        } catch (IOException e) {
            throw new SaveFileEx(e);
        }
    }

    private static void replaceText(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.equals("?")) {
                entry.setValue(String.valueOf(key.length()));
            } else if (!value.matches("[0-9]+")) {
                throw new IllegalArgumentException("Error in string: " + entry);
            }
        }
    }

    private static Map<String, String> readFile(String filePath) throws ReadFileEx {
        Map<String, String> map = new LinkedHashMap<>();
        File file = new File(filePath);
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                String line = sc.nextLine();
                String[] temp = line.split("=");
                map.put(temp[0], temp[1]);
            }
        } catch (FileNotFoundException e) {
            throw new ReadFileEx(e);
        }
        return map;
    }
}
