package Day58_Polymorphism;

public class SuperMan_Test {
    public static void main(String[] args) {

        Father sdet1 = new superMan();
        sdet1.feedKid();
        sdet1.raiseKid();
        sdet1.playWithKid();

        System.out.println();

        Worker sdet2 = new superMan();
        sdet2.getPaid();

        // Casting from one class another
        ((Father)sdet2).playWithKid();
        ((superMan)sdet2).getPaid();
        sdet2.work("Tester");

        System.out.println();

        superMan sdet3 = new superMan();
        sdet3.getPaid();
        sdet3.work("Tester");
        sdet3.feedKid();
        sdet3.raiseKid();
        sdet3.playWithKid();


    }
}

