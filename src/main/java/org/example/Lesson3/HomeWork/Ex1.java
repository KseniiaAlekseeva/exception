package org.example.Lesson3.HomeWork;

import java.io.IOException;

public class Ex1 {
    public static void main(String[] args) {
        try {
            Person person = parsePerson("8 ррр а ыы f 01.11.1223");
            Person person1 = parsePerson("01.11.1896 8 ррр а ыы f");
            Person person2 = parsePerson("8 пппрш а ыы f 01.11.1223");
            if (person != null) {
                System.out.println(person.toString());
                System.out.println(person1.toString());
                System.out.println(person2.toString());
                person.saveToFile();
                person1.saveToFile();
                person2.saveToFile();
            }
        } catch (FormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Person parsePerson(String s) throws FormatException {
        String name = null;
        String date = null;
        String phone = null;
        String sex = null;
        String[] arr = s.split(" +");
        int codeCorrect = checkRecord(arr);
        if (codeCorrect != -1) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].matches("[0-9]+")) {
                    phone = arr[i];
                }

                if (arr[i].matches("f|m")) {
                    sex = arr[i];
                }

                if (arr[i].matches("\\d{2}.\\d{2}.\\d{4}")) {
                    String[] datePart = arr[i].split("\\.");
                    if (Integer.parseInt(datePart[0]) > 0
                            && Integer.parseInt(datePart[0]) < 31
                            && Integer.parseInt(datePart[1]) > 0
                            && Integer.parseInt(datePart[1]) < 13) {
                        date = arr[i];
                    }
                }

                if ((i < arr.length - 2)
                        && arr[i].toLowerCase().matches("[а-я]+")
                        && arr[i + 1].toLowerCase().matches("[а-я]+")
                        && arr[i + 2].toLowerCase().matches("[а-я]+")) {
                    name = arr[i] + " " + arr[i + 1] + " " + arr[i + 2];
                    i += 2;
                }
            }
            if (name == null)
                throw new FormatException("Wrong format of NAME.");
            if (date == null)
                throw new FormatException("Wrong format of DATE.");
            if (phone == null)
                throw new FormatException("Wrong format of PHONE.");
            if (sex == null)
                throw new FormatException("Wrong format of SEX.");
            return new Person(name, date, phone, sex);
        } else {
            parseCode(checkRecord(arr));
            return null;
        }
    }

    public static int checkRecord(String[] arr) {
        if (arr.length != 6)
            return -1;
        return 0;
    }

    public static void parseCode(int code) {
        if (code == -1)
            System.out.println("Error " + code + ". Number of records is incorrect.");
    }
}
