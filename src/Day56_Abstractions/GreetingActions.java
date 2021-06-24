package Day56_Abstractions;

public class GreetingActions {
    public static void main(String[] args) {

        MountainLanguage ml = new MountainLanguage();
        ml.hi();
        ml.bye();

        Greeting gt = new MountainLanguage();
        gt.hi();
        gt.bye();

        Japanese jp = new Japanese();
        jp.hi();
        jp.bye();

        Greeting gp = new Japanese();
        gp.hi();
        gp.bye();

        //-------------------------------
        gt = new Japanese();
        // ml = new Japanese();

    }
}
