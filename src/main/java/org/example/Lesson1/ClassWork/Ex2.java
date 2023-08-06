package org.example.Lesson1.ClassWork;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int[] arr = new int[]{-1, 3, 8, 0, 3, 12};
        dialog(arr);
    }

    private static void dialog(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        parseCode(checkValue(arr, size, 5));
    }

    private static void parseCode(int code) {
        switch (code) {
            case -1:
                System.out.println("Array length less then minimum.");
                break;
            case -2:
                System.out.println("Element not found.");
                break;
            case -3:
                System.out.println("Array is not initialized.");
            default:
                System.out.println("Index of searchable element is " + code + ".");
                break;
        }
    }

    private static int checkValue(int[] arr, int num, int minLength) {
        if (arr == null)
            return -3;
        if (arr.length < minLength)
            return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num)
                return i;
        }
        return -2;
    }
}
