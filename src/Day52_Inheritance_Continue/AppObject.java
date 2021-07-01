package Day52_Inheritance_Continue;

public class AppObject {
    public static void main(String[] args) {

        MobileApp mobileApp = new MobileApp();
        mobileApp.setName("Facebook");
        mobileApp.useTheApp(20);
        mobileApp.setVersion(2.3);
        //System.out.println("Version: " + mobileApp.setVersion(2.3));

        System.out.println();

        Instagram instagram = new Instagram();
        instagram.setName("Instagram");
        instagram.setVersion(4.9);
        instagram.useTheApp(30);

        System.out.println();

        Discord discord = new Discord();
        discord.setName("Discord");
        discord.setVersion(3.10);
        discord.download();
        discord.useTheApp(40);
        discord.chat("Nijat");
        System.out.println();
        discord.printInfo();
    }
}
