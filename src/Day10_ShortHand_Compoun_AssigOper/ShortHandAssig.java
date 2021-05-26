package Day10_ShortHand_Compoun_AssigOper;

public class ShortHandAssig {
    public static void main(String[] args) {

        // += , -= , *= , /= , %=

        // 1- Some thrikey things that have to pay attention

        int student = 400;
        // student = student + 10;    System.out.println(student);   // 410
        student += 10;             System.out.println(student);         // 410
                                   System.out.println("________But!______");
        // But, look at these
        student = + 10;             System.out.println(student); // 10
        student = - 10;             System.out.println(student); // -10
                                    System.out.println("________Boolean________");
        // About Boolean
        boolean woodenSpoon = false;                    System.out.println(woodenSpoon); // false
        boolean muradil = (woodenSpoon = true);         System.out.println(muradil);     // true
                                                        System.out.println("_____Minutes________");
        // About Remainder in short hand operators
        int minutes = 234;
        int hours = minutes / 60;                      System.out.println(hours); // 3 hours
        int minutesRem = minutes % 60;                 System.out.println(minutesRem); // 54 minutes
                                                       System.out.println("______Apples_______");
        // More Examples,
        double apples = 3.5;
               apples += 0.5;                          System.out.println(apples);

        apples -= 0.5;                                 System.out.println(apples);
        apples *= 2;                                   System.out.println(apples);
        apples /=4;                                    System.out.println(apples);



    }
}
