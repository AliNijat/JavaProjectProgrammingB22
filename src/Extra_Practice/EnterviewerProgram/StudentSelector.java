package Extra_Practice.EnterviewerProgram;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StudentSelector {
    public static void main(String[] args) {

    }

    public static void studentSelector() throws InterruptedException {
        String[] peoples = {
                "Aziz",
                "Kibi",
//                "sTaN",
                "Edward",
//                "Bahruz",
                "Andrei",
                "Onurcan",
//                "Tatyana",
                "Biniyam",
                "Elgun",
//                "Andrew",
                "Nevzat",
                "Nijat",
//                "Serhii"
        };
        List<String> names = Arrays.asList(peoples);
        names.replaceAll(String::toUpperCase);
        int index = new Random().nextInt(names.size());
        String student = names.get(index);
        System.out.println(student + " will be interviewed now! " +
                "\nYou have 15 seconds to start answering the questions - Good Luck! ");
        for (int i = 1; i <= 1; i++) {
            Thread.sleep(1000);
            System.out.print(i + " ");
        }
    }
}
