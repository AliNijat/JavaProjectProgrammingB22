package Day34_Custom_Methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("->>Starting Etsy search smoke testing<<-");
        openBrowser();
        navigateToEtsyURl();
        searchForWoodenSpoon();
        verifyResultDisplayed();

    }

    public static void openBrowser() {
        System.out.println("1. Launching Chrome browser");
    }

    public static void navigateToEtsyURl() {
        System.out.println("2. Click on Etsy link>Https://www.etsy.com/");
    }

    public static void searchForWoodenSpoon() {
        System.out.println("3. Type and search for wooden spoon");
    }

    public static void verifyResultDisplayed() {

        System.out.println("4. Confirm that result match expected item");
    }
}
