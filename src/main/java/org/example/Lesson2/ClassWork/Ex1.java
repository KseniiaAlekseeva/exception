package org.example.Lesson2.ClassWork;

public class Ex1 {
    public static void main(String[] args) {
        String arr[][] = new String[][]{{"1", "23", "0"}, {"adw", "44"}};
        System.out.println(ex2(arr));
    }

    public static int ex2(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                String item =arr[i][j];
//                if (checkText(item)) {
                if (item.matches("[0-9]+")){
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }
        }
        return sum;
    }

    private static boolean checkText(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9')
                return false;
        }
        return true;
    }
}
