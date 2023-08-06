package org.example.Lesson2.HomeWork;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            checkString(str);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void checkString(String str) throws MyException {
        if (str.isEmpty()) {
            throw new MyException("String must not be empty.");
        }
        System.out.println("str = " + str);
    }
}
