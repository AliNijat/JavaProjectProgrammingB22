package Day05_Primitives_Concatanation;

public class PrimitivesExample {
    public static void main(String[] args) {

        // The small integer value
        byte byteValue = 127;
        short shortValue = 32565;

        // The big integer value
        int intValue = 423689423;
        long longValue = 8473294693287989799l;

        // The decimal numbers
        float floatValue = 42324646464638.887f;
        double doubleValue = 9473907897.887;

        // The Character type
        char charValue = 'M'; // We can only put one single letter or character

        // For true or false condition --> yes, or no
        boolean booleanValue = true;
                booleanValue = false;

        // Most of time we using the "int" and "double"

        System.out.println(byteValue + "\n"+ intValue + "\n"+ shortValue +
                "\n"+ floatValue + "\n"+ doubleValue + "\n"+ charValue + "\n"+ booleanValue);

    }
}
