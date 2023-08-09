package org.example.Lesson3.ClassWork;

import java.io.IOException;

public class Counter implements AutoCloseable {
    private int count;
    private boolean closed;

    public Counter() {
        this.count = 0;
        this.closed = false;
    }

    public void add() throws IOException{
        if (closed){
            throw new IOException();
        }
        closed = false;
        count++;
    }

    public boolean isClosed(){
        return closed;
    }

    @Override
    public void close() {
        closed = true;
        System.out.println("Counter is closed.");
    }

    public int getCount() {
        return count;
    }
}
