package org.example.Lesson3.ClassWork;

public class Ex4 {
    public static void main(String[] args) {
        try {
            System.out.println(division(1, 0));
        } catch (DivByZeroEx e) {
            e.printStackTrace();
        }
    }

    public static double division(int a, int b) {
        if (b == 0)
            throw new DivByZeroEx("Division by zero is not permitted!");
        return (double) a / b;
    }
}
