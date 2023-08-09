package org.example.Lesson3.HomeWork;

public class Ex1 {
    public static void main(String[] args) {
        try {
            System.out.println(parsePerson("ррр f ыы 8 ппп 01.11.1223 jj").toString());
        } catch (FormatException e) {
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

                if (name == null)
                    throw new FormatException("Wrong format of NAME.");
                if (date == null)
                    throw new FormatException("Wrong format of DATE.");
                if (phone == null)
                    throw new FormatException("Wrong format of PHONE.");
                if (sex == null)
                    throw new FormatException("Wrong format of SEX.");
            }
        } else {
            parseCode(checkRecord(arr));
        }
        return new Person(name,date,phone,sex);
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
