package org.example.Lesson1.ClassWork;

public class Ex1 {
    public static void main(String[] args) {
        int arr[] = new int[]{-1, 2, 3, 5, 10, 0, -4};
        System.out.println("checkLength(arr, 7) = " + checkLength(arr, 9));
    }

    static int checkLength(int[] arr, int minLength) {
        if (arr.length < minLength)
            return -1;
        return arr.length;
    }
}
