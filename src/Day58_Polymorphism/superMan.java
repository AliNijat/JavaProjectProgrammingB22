package Day58_Polymorphism;

public class superMan extends Father implements Worker{

    @Override
    public void work(String job) {
        System.out.println("Super man is working as " + job);

    }

    @Override
    public double getPaid() {
        System.out.print("Super man is getting paid \n$");
        return 1000;
    }
}
