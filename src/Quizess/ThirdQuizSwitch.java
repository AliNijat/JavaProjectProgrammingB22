package Quizess;

import com.sun.deploy.panel.CacheSettingsDialog;

public class ThirdQuizSwitch {
    public static void main(String[] args) {


        String opt = "true";
        switch (opt){
            case "true":
                System.out.println("Treu");
                break;
            default:
                System.out.println("false");

        }
        System.out.println("done");

        int z = 11;
        switch (z){
            case 10:
                System.out.println("Mo");
            case 11:
                System.out.println("tu");
            case 12:
                System.out.println("Wen");
            default:
                System.out.println("Fri");
        }

        float f1 = (12435.1 > 12345.0)? 12456: 12456.02f;
        float f2 = f1 + 1024;
        System.out.println(f2);
    }
}
