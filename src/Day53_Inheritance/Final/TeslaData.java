package Day53_Inheritance.Final;

public final class TeslaData {

    // TeslaData class that has al ist of constants
    // Values of below variables cannot be changed anywhere

    public static final String ADMIN_USERNAME = "Admin";
    public static final String ADMIN_PASSWORD = "password1234";
    public static final int MAX_WAIT_TIME = 60;
    public static final boolean STOP_IF_FAIL = true;
}

// class child extends TeslaData{ }     ERROR: Cannot inherit from final class
