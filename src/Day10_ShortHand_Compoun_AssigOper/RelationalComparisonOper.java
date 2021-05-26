package Day10_ShortHand_Compoun_AssigOper;

public class RelationalComparisonOper {
    public static void main(String[] args) {

        // > , < , >= , <= , == , !=  These operators are for comparing two things or value. Like Integer and Decimal and Characters
        //  == , !=   Using with all data types and especially boolean
        // These all operators return the result in "TRUE or FALSE"

        int n1 = 50;
        int n2 = 100;

        System.out.println(n2 > n1);
        System.out.println(n2 < n1);
        int n3 = 100;
        System.out.println(n2 == n2);
        System.out.println(n2 != n2);
        System.out.println("____________");

        boolean result = n2 == n3;
        System.out.println(result);

        double d1 = 100.5;
        double d2 = 1005;
        System.out.println(d1 >= d2);
        System.out.println(d1 <= d2);
        System.out.println("___________");

        char lt = 'A';
        char lt2 = 'Z';
        System.out.println(lt == lt2);
        boolean test = lt == lt2;
        System.out.println(test);
    }
}
