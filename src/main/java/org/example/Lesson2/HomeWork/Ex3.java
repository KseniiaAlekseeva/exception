package org.example.Lesson2.HomeWork;

import java.io.FileWriter;
import java.io.IOException;

public class Ex3 {
    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234, "testFile.txt");
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Division by zero. " + ex.getMessage());
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(int a, int b, String filePath) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        Integer sum = a + b;
        writer.write(sum.toString());
        writer.write("\n");
        writer.close();
    }

}
