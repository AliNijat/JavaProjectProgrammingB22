package Day49_Static_Examples;

public class StaticVariablesTest {
    public static void main(String[] args) {

        System.out.println(staticVariables.name);
        System.out.println(staticVariables.userName);
        System.out.println(staticVariables.age);
        System.out.println("$" + staticVariables.price);

        System.out.println("driver.findElement(By.xpath("+Locators.userName +
                ").sendKeys(" + staticVariables.userName+")");
    }
}
