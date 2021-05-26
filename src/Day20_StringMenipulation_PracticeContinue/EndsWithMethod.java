package Day20_StringMenipulation_PracticeContinue;

public class EndsWithMethod {
    public static void main(String[] args) {

        String email = "alinijAt97809@gmail.com";

        if (email.startsWith("a") && email.contains("@") && email.endsWith("com")) {
            System.out.println("It's a valid email address");
        }
        else {
            System.out.println("Invalid email address");
        }

        email = "alinijAt97809@gmail.com";

        if (email.startsWith("a") && email.toLowerCase().contains("a") && email.endsWith("com")) {
            System.out.println("It's a valid email address");
        }
        else {
            System.out.println("Invalid email address");
        }
    }
}
