package org.example.Lesson1.ClassWork;

public class Ex3 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 1, 1}};

        while (true) {
            try {
                System.out.println("sumArray(arr) = " + sumArray(arr));
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }
    }

    private static int sumArray(int[][] arr) {
        int sum = 0;
        if (arr == null)
            throw new RuntimeException("Array is not initialized");
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length)
                throw new RuntimeException("Array is not square.");
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1)
                    throw new RuntimeException("Element (" + i + "," + j + ") = " + arr[i][j] + " don't equals 0 and 1.");
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
