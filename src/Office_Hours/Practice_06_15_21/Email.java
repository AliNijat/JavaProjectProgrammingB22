package Office_Hours.Practice_06_15_21;

public class Email {

    final String ADDRESS;
    int numberOfEmail;
    static String domain;

    static {
        domain = "generic";
    }

    public Email(String address, int numberOfEmail){
        this.ADDRESS = address;
        this.numberOfEmail = numberOfEmail;
    }

    public static void sendEmail(){
        System.out.println("sending from parent email");
    }

    @Override
    public String toString() {
        return "Email " +
                "Address = '" + ADDRESS + '\'' +
                ",\nNumberOfEmail = " + numberOfEmail +
                ",\nDoumain = " + domain +
                ' ';
    }
}
