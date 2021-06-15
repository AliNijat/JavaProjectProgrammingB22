package Day48_Constructor_Static;

public class Bus {
    driver driver;
    engine engine;


    public String toString(){
        return driver.getName() + " | " + engine.getCylinders();
    }



}
