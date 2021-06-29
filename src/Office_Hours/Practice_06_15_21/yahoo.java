package Office_Hours.Practice_06_15_21;

public class yahoo extends Email{

    static String domain;
    static {
        domain = "Yahoo";
    }
    public yahoo(String address, int numberOfEmail) {
        super(address, numberOfEmail);
    }
}
