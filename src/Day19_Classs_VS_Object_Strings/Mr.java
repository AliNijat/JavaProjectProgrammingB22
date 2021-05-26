package Day19_Classs_VS_Object_Strings;

public class Mr {
    public static void main(String[] args) {


        // Test cases or test data
        String firstName = "Dr. Nadir";
        if (firstName.startsWith("Dr.")){
            System.out.println("This person is a doctor");
        } else if (firstName.startsWith("Mr.")){
            System.out.println("This person is a Man");
        } else if (firstName.startsWith("Mrs.")){
            System.out.println("This person is a Married woman");
        } else if (firstName.startsWith("Ms.")){
            System.out.println("This person is a Single woman");
        } else if (firstName.startsWith("Sr.")){
            System.out.println("This person is a Senior");
        }
    }
}
