package Day34_Custom_Methods;

import com.sun.xml.internal.ws.addressing.WsaTubeHelper;

public class StartCar {
    public static void main(String[] args) {

        seatInCar();
        startCar();
        shiftToDrive();
        presGasPedal();

    }

    public static void seatInCar() {
        System.out.println("1. seat in car!");
    }

    public static void startCar() {
        System.out.println("2. Use your key to turn on the car!");
    }

    public static void shiftToDrive() {
        System.out.println("3. Now you can drive your car!");
    }

    public static void presGasPedal() {
        System.out.println("4. Now you can move on!");
    }
}
