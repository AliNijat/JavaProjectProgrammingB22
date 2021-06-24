package Day56_Abstractions;

public abstract class Transportation {

    public abstract void transportPeople();
    public abstract void cost(int mile);

    public void start(){
        System.out.println("Starting the engine");
    }
    public void stop(){
        System.out.println("Shout off the engine");
    }
}
