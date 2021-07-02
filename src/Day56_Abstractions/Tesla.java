package Day56_Abstractions;

public class Tesla extends Transportation implements SelfDriveable, Greeting {

    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting the people on the road");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla cost " + (mile + 0.10 )+ " to drive " + mile + " miles");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Tesla is auto piloting car ");
    }

    @Override
    public void autoDriving() {
        System.out.println("Tesla is a auto driveable car");
    }

    @Override
    public void hi() {
        System.out.println("Tesla saying Hi, Welcome");
    }

    @Override
    public void bye() {
        System.out.println("Tesla saying Bye, bye");
    }
}
