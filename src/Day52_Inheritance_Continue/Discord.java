package Day52_Inheritance_Continue;

public class Discord extends MobileApp {

    public void  chat(String someone){

        System.out.println("Chatting with " + someone + " on Discord");
    }

    @Override
    protected boolean download(){
        System.out.println("Discord version " + version + " is downloaded");
        return true;
    }

    @Override
    public void useTheApp(int minutes){
        super.useTheApp(minutes);
        chat("Ali");
    }
}
