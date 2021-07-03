package Day58_Polymorphism;

public class Casting {
    public static void main(String[] args) {

        Worker worker = new superMan();
        worker.work("Tester");
        worker.getPaid();

        // Cating
        ((Father)worker).playWithKid();
        ((superMan)worker).getPaid();




    }
}
