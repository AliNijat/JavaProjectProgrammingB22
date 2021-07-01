package Day52_Inheritance_Continue;

public class AppObject {
    public static void main(String[] args) {

        MobileApp mobileApp = new MobileApp();
        mobileApp.name = "Facebook";
        mobileApp.useTheApp(20);
        mobileApp.version = 2.3;
        System.out.println("Version: " + mobileApp.version);

        System.out.println();

        Instagram instagram = new Instagram();
        instagram.name = "Instagram";
        instagram.version = 4.9;
        instagram.useTheApp(30);

        System.out.println();

        Discord discord = new Discord();
        discord.name = "Discord";
        discord.version = 3.10;
        discord.useTheApp(40);
        discord.chat("Nijat");
    }
}
