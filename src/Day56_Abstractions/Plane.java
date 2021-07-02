package Day56_Abstractions;

public class Plane extends Transportation implements SelfDriveable, Greeting{
    @Override
    public void transportPeople() {
        System.out.println("Flying people from one city to another");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane cost " + (mile + 25.10 )+ " to drive " + mile + " miles");
    }

    @Override
    public void hi() {
        System.out.println("Hi");
    }

    @Override
    public void bye() {
        System.out.println("Bye");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Flying on Auto-Pilot mode ");
    }

    @Override
    public void autoDriving() {
        System.out.println("Plane don't driving it flying");
    }
}
