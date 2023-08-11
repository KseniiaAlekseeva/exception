package org.example.Lesson3.HomeWork;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Person {
    private String name;
    private String birthDate;
    private String phone;
    private String sex;

    public Person(String name, String birthDate, String phone, String sex) {
        this.name = name;
        this.birthDate = birthDate;
        this.phone = phone;
        this.sex = sex;
    }


    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public String getSex() {
        return sex;
    }

    public void saveToFile() throws IOException {
        String filePath = name.split(" ")[0] + ".txt";
        FileWriter writer = new FileWriter(filePath, true);
            writer.write(name + " " + birthDate + " " + phone + " " + sex);
            writer.write("\n");
            writer.close();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phone='" + phone + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
