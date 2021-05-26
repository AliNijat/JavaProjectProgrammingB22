package Replit_And_Practice_Tasks.ArrayTasks;

import java.util.Arrays;

/*
An array inhabitants represents cities and their respective populations. For example, the following arrays shows 8 cities and their respective populations:

[3, 6, 0, 4, 3, 2, 7, 0]
[3, 6, 0, 4, 3, 2, 7, 0]
Some cities have a population of 0 due to a pandemic zombie disease that is wiping out the human lives. After each day, any city that is adjacent to a zombie-ridden city will lose half of its population (City that has a 0 population).

Write a program to loop though each city population and make it lose half of its population if it is adjacent(right or left) to a city with zero people until all cities have no humans are left.

Make updates to each element in the array And print the array like below for each day:

Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----
Write the program in a way that it will handle any number of people in cities, above was just an example.
 */
public class ZombieAttack2 {
    public static void main(String[] args) {

        int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};
        int day = 0;
        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));

        while (!Arrays.equals(inhabitants, new int[8])) {

            int tep[] = Arrays.copyOf(inhabitants, inhabitants.length);

            for (int i = 0; i < tep.length; i++) {
                if (inhabitants[i] == 0) {
                    if (i == 0) {

                        tep[i + 1] = (tep[i + 1]) / 2;
                    } else if (i == inhabitants.length - 1) {
                        tep[i - 1] = (tep[i - 1]) / 2;
                    } else {
                        tep[i + 1] = (tep[i + 1]) / 2;
                        tep[i - 1] = (tep[i - 1]) / 2;
                    }
                }
            }

            inhabitants = Arrays.copyOf(tep, tep.length);
            System.out.println("Day " + day++ + " " + Arrays.toString(inhabitants));
        }
        System.out.println("----------- EXTINCT -----------");

    }
}
