package Day30_Array_Intro;

import java.util.Locale;

public class StudentList {
    public static void main(String[] args) {

        String student[] = new String[5];
        student[0] = "DD232";
        student[1] = "Ali";
        student[2] = "Nijat";
        student[3] = "B22";
        student[4] = "202-1234-345";

        System.out.println("Student ID: " + student[0]);
        System.out.println("Student first name: " + student[1]);
        System.out.println("Student last name: " + student[2]);
        System.out.println("Student batch number: " + student[3]);
        System.out.println("Student phone number: " + student[4]);
        System.out.println("Student data length: " + student.length);

        System.out.println("******************************************************************");

        String[] student1 = {"23123", "Ali", "Nijat", "B22", "398473290"};

        System.out.println("Student1 ID: " + student1[0]);
        System.out.println("Student1 first name: " + student1[1]);
        System.out.println("Student1 last name: " + student1[2]);
        System.out.println("Student1 batch number: " + student1[3]);
        System.out.println("Student1 phone number: " + student1[4]);
        System.out.println("Student1 data length: " + student1.length);

        // first way to check and make sure that the length of data match for every single data of students
        if (student.length == student1.length) {
            System.out.println("PASS: Data arrays length match");
        } else {
            System.out.println("FAIL: Data arrays length doesn't match");

        }

        // second way, to check the data size and length for all students
        if (student.length == 5) {
            System.out.println("PASS: Data arrays length match");
        } else {
            System.out.println("FAIL: Data arrays length doesn't match");
        }
        System.out.print(student1[1].toUpperCase(Locale.ROOT) + "" +
                " " + student1[2].toUpperCase(Locale.ROOT));
        System.out.println();
        System.out.println("╭┈─────「\uD83E\uDD8B 」\n╰─┈➤Yᴏᴜ ᴀʀᴇ loving java!♥");

    }
}
