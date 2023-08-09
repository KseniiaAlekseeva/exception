package org.example.Lesson3.ClassWork;

import java.io.IOException;

public class Ex2 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void doSomething() throws IOException {

    }
}
