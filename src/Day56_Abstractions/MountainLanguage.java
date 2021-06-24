package Day56_Abstractions;

public class MountainLanguage implements Greeting{

    @Override
    public void hi() {
        System.out.println("Zeee");
    }

    @Override
    public void bye() {
        System.out.println("Bueee");
    }
}
