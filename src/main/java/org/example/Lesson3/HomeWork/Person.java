package org.example.Lesson3.HomeWork;

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
