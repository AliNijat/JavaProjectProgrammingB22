package Day45_OOP;

public class TrafficLightObject {
    public static void main(String[] args) {

        // create traffic objects
        TrafficLight trafficLight = new TrafficLight();
        // trafficLight.color = "read"; now we will not use this way. we will call the method
        trafficLight.changeColor("red");

        //System.out.println("trafficLight = " + trafficLight);
        trafficLight.showColor();
        trafficLight.action();

        trafficLight.changeColor("green");
        trafficLight.showColor();
        trafficLight.action();

        TrafficLight trafficLight1 = new TrafficLight();
        trafficLight1.changeColor("black");

        trafficLight1.showColor();
        trafficLight1.action();


    }
}
