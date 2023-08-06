package org.example.Lesson2.HomeWork;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc;
        do {
            System.out.println("Enter a float number: ");
            sc = new Scanner(System.in);
        } while (!checkNumber(sc));

        float num = sc.nextFloat();
        System.out.println("Float number = " + num);
    }

    private static boolean checkNumber(Scanner sc) {
        if (sc.hasNextFloat())
            return true;
        return false;
    }
}
