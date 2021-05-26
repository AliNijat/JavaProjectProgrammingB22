package Day28_Loop_Practice;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class MonthDays {
    public static void main(String[] args) {

        int totalCase = 0;

        for (int Day = 1; Day <= 30; Day++){

             if (Day % 7 == 0){
                 totalCase += 500;

             }else {
                 totalCase += 200;

             }
            System.out.println("Day " + Day + " | Total case = " + totalCase + LocalDate.now());

        }

        System.out.println("Java city Nov, 2011 total cases: " + totalCase + LocalDateTime.now());


    }
}
