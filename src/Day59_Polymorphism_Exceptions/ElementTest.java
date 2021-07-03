package Day59_Polymorphism_Exceptions;

public class ElementTest {
    public static void main(String[] args) {

        Link link = new Link();
        link.sendKeys("Hello");
        link.click();
        link.getText();
        link.getLinkHref();

        System.out.println();

        WebElement webElement = new Link();
        webElement.click();
        webElement.getText();
        webElement.sendKeys("Hello Hello");


    }
}
