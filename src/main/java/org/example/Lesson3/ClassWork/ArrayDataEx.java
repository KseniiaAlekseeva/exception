package org.example.Lesson3.ClassWork;

public class ArrayDataEx extends IllegalArgumentException{
    private int i;
    private int j;
    public ArrayDataEx(int i, int j) {
        super("Wrong format in element (" + i + "," + j + ")");
    }
}
