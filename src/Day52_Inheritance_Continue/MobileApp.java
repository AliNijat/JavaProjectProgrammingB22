package Day52_Inheritance_Continue;

public class MobileApp {

    String name;
    double version;

    protected  boolean download(){
        System.out.println("App: " + name + " Version " + version);
        return true;
    }

    public void useTheApp (int minutes){
        System.out.println("Using " + name + " Version " + version + " app for " + minutes + " minutes");
    }
}
