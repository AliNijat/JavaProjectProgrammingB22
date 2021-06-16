package Office_Hours.Practice_06_15_21;

public class Gmail extends Email{

    static String domain;
    static {
        domain = "Gmail";
    }
    public Gmail(String address, int numberOfEmail) {
        super(address, numberOfEmail);
    }

    public static void sendSuperEmail(){
       Email.sendEmail();
    }

    public static void sendEmail(){
        System.out.println("sending from gmail");
    }

}
