package Day08_Casting_ScannerIntro;

public class CastingExample {
    public static void main(String[] args) {

        // byte < short --> casted automatically
        byte numByte = 123;
        short numShort = numByte;
        System.out.println("numByte = " + numByte);
        System.out.println("numShort = " + numShort);
        System.out.println("_______________________");

        // short > byte --> needed to cast manually by using parentheces
        short numShort2 = 12345;
        byte numByte2 = (byte) numShort2;
        System.out.println("numShort2 = " + numShort2);
        System.out.println("numByte2 = " + numByte2);
        System.out.println("__________________________");

        // The same rule in big primitives/numbers as well
        int num1 = 1234;
        long num2 = num1;

        long num3 = 4321;
        int num4 = (int) num3;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("______________________");
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

    }
}
