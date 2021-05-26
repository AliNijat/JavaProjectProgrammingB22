package Day08_Casting_ScannerIntro;

public class CastingExampleWithQuestion {
    public static void main(String[] args) {

        // Implicit Casting and Explicit Casting

        // 1- Implicit Casting/Converting
        //  byte > short > int > long > float > double

        int intNum = 2021;
        double doubleNum = intNum; // It's work, no need to casting cause it did automatically or implicity

        long longNum = 398479237849l;
        float floatNum = longNum;

        byte byteNum = 124;
        short shortNum = byteNum;

        // 2- Explicit Casting/Converting ==> Bigger data type Or primitive to smaller
        //  byte < short < int < long < float < double

        short s = 400;
        byte b = (byte) s; // Here, its doesn't work without casting. Need to do by manually.

        int i = 1000;
        short s2 = (short) i; // We put the data type within printheces before the value.

        long l = 3473284;
        int i1 = (int) l;

        float f = 1000.500f;
        long l1 = (long) f;

        double d = 1000000;
        int i2 = (int) d;

        // Boolean can't cast or convert


    }
}
