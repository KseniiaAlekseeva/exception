package org.example.Lesson2.ClassWork;

import java.io.IOException;

public class ReadFileEx extends IOException {
    public ReadFileEx(Throwable cause) {
        super("File reading is not successfull.", cause);
    }
}
