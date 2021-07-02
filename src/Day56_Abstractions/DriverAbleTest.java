package Day56_Abstractions;

public class DriverAbleTest {
    public static void main(String[] args) {

        Tesla tesla = new Tesla();
        tesla.start();
        tesla.hi();
        tesla.transportPeople();
        tesla.cost(300);
        tesla.autoDriving();
        tesla.stop();
        tesla.bye();

        System.out.println();

        Plane plane = new Plane();
        plane.start();
        plane.hi();
        plane.cost(20);
        plane.autoPiloting();
        plane.stop();
        plane.bye();
    }
}
