package Day33_Arrays_Continue;

import java.util.Arrays;

public class MultiDArrayExample {
    public static void main(String[] args) {

        String [][] users = new  String[3][2];

        // longest way
        users[0][0] = "Teodora Tsvetanov";
        users[0][1] = "TeodorasPWD12";
        users[1][0] = "Anna Ziyaeva";
        users[1][1] = "AnnaAlmaty123";
        users[2][0] = "Parvin Altae";
        users[2][1] = "ParvinVienna321";

        // shortedt way
        String [][] usersData = {{"Teodora Tsvetanov","TeodorasPWD12" },
                                 {"Anna Ziyaeva", "AnnaAlmaty123"},
                                 {"Parvin Altae", "ParvinVienna321"}};

        System.out.println(usersData[0][0].split(" ")[0]);// first name from arry
        System.out.println();

        System.out.println(usersData[0][0]+ "\n\t" + usersData[1][0] + "\n\t" + usersData[2][0]);
        System.out.println(usersData[0][1]+ "\n\t" + usersData[1][1] + "\n\t" + usersData[2][1]);
        System.out.println();

        // print all
        System.out.print(Arrays.deepToString(usersData)); // deepToString
    }
}
