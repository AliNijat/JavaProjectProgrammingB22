package Day37_Methods_OverLoading;

public class OverloadingMethods {
    public static void main(String[] args) {

        System.out.println("Full Name: " + myMethod("Jahan", "Askari"));
        System.out.println("Age: " + myMethod(2021, 1986));
        System.out.println("Saving: " + myMethod(14000, 50000));
        System.out.println("Married?: " +myMethod(true));
        System.out.println("Initial: " + myMethod("Jahan", "Askari"));

        String firstName = "Ali";
        String lastName = "Nijat";
        System.out.println(""+ firstName.substring(0,1) + lastName.substring(0,1));

    }
    public static String myMethod( String firstName, String lastName) {
       String fullName = firstName + ", " + lastName;
        return fullName;
    }

    public static int myMethod(int birthDay, int CurrentYear) {
         int  age = birthDay - CurrentYear;
         return age;
    }

    public static double myMethod( double inCome, double outCome, double saving) {
        saving = inCome - outCome;
        return saving;
    }

    public static boolean myMethod(boolean isMarried) {
        return isMarried;
    }

    public static void myMethod( String  firstName, String lastName, String initial) {
        initial = "" + firstName.substring(0,1) + lastName.substring(0,1);
        System.out.println(initial);

    }
}
