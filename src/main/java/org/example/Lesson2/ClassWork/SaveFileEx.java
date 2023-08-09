package org.example.Lesson2.ClassWork;

import java.io.IOException;

public class SaveFileEx extends IOException {
    public SaveFileEx(Throwable cause) {
        super("Writing to file is not successfull.", cause);
    }
}
