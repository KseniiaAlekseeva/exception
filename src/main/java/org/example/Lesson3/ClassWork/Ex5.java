package org.example.Lesson3.ClassWork;

public class Ex5 {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"1", "1", "1", "0"},
                {"0", "1", "1", "0"},
                {"1", "1", "1", "9l"},
                {"1", "1", "0", "0"}};
        try {
            System.out.println("sumElements(arr) = " + sumElements(arr));
//        }catch (ArraySizeEx | ArrayDataEx e){
//            e.printStackTrace();
//        }
        }catch (IllegalArgumentException e){
            e.printStackTrace();
        }
    }

    public static int sumElements(String[][] arr) {
        int sum = 0;
        int size = 4;
        if (arr.length != 4)
            throw new ArraySizeEx("Number of rows is not equal to 4: Nrows = " + arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4)
                throw new ArraySizeEx("Number of cols is not equal to 4: Ncols(" + i + ") = " + arr[i].length);
            for (int j = 0; j < arr[i].length; j++) {
//                if (!arr[i][j].matches("[0-9]+"))
//                    throw new ArrayDataEx(i,j);
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataEx(i, j);
                }
            }
        }
        return sum;
    }
}
