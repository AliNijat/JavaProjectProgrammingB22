package Day33_Arrays_Continue;

public class GroupFriends_Array {
    public static void main(String[] args) {

        String []group = {"Aziz", "Parvin", "OOgii", "IWin", "Chrissy", "Maria", "Duraid", "Rasim", "Berk", "Inthira"};

        for (String each : group ) {
            System.out.println("Happy Holidays |Group_27| >> " + each +  "!♥");
        }
        System.out.println("******************************************");
        for (int i = group.length-1, j = 0; i >= 0 ; i--, j++) {
            System.out.println(group[i] + "\t\tis at index of \t" + i);

        }

    }
}
