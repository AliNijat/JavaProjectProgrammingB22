package Day59_Polymorphism_Exceptions;

public class Link implements WebElement{
    public static final String TAG = "a href";

    public void getLinkHref(){
        System.out.println("https://www.nijat.com");
    }

    @Override
    public void sendKeys(String txt) {
        System.out.println("Not supported");
    }

    @Override
    public void click() {
        System.out.println("Clicking the link");
    }

    @Override
    public String getText() {
        System.out.println("Getting the link text");
        return "Text of the link";
    }
}
