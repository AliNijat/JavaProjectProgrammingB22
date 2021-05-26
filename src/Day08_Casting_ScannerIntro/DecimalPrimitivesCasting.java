package Day08_Casting_ScannerIntro;

public class DecimalPrimitivesCasting {
    public static void main(String[] args) {

        // double > float -->
        double numDouble1 = 1232324000;
        float numFloat1 = (float) numDouble1;

        double numDouble2 = numFloat1;

        System.out.println("numDouble1 = " + numDouble1);
        System.out.println("numFloat1 = " + numFloat1);
        System.out.println();
        System.out.println("numDouble2 = " + numDouble2);


    }
}
