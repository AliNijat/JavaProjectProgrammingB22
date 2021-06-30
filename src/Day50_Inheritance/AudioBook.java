package Day50_Inheritance;

public class AudioBook extends Book {

    int length;
    String narrator;

    public void listen(){
        System.out.println("Someone is listening to " + title );
    }
}
