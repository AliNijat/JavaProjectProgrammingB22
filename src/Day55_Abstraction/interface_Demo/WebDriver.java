package Day55_Abstraction.interface_Demo;

public interface WebDriver {

    public abstract void get(String url);
    public abstract void findElement(String locator);
    void quit();



}
