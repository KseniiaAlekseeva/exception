package org.example.Lesson3.ClassWork;

import java.io.IOException;

public class Ex3 {
    public static void main(String[] args) {
        try (Counter counter = new Counter()) {
            counter.add();
            counter.close();
            counter.add();
            System.out.println(counter.getCount());
            System.out.println(counter.isClosed());
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}
