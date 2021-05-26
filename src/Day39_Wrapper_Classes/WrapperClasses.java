package Day39_Wrapper_Classes;

public class WrapperClasses {
    public static void main(String[] args) {

        int num = 100;
        System.out.println("num = " + num);
        num += 10;
        System.out.println(num);

        Integer n = new Integer(500);
        System.out.println("is n 500? = " + n.equals(500));
        System.out.println(n + 300);

        Integer nn = 1000;
        System.out.println(nn / 50);
        //convert n2 to String
        String numStr = nn + "";
        String numSt = nn.toString();

        System.out.println("numStr = " + numStr);
        System.out.println("numSt = " + numSt);

        //** Declaring and initialization WRAPPER Class

        Byte b1 = new Byte((byte) 10);
        Byte b2 = 20;

        Short sh1 = new Short((short) 50);
        Short sh2 = 100;

        Integer n1 = new Integer(500);
        Integer n2 = 500;

        Float fl1 = new Float(400f);
        Float fl2 = 500.9f;

        Long l1 = new Long(1000l);
        Long l2 = 4000l;

        Double d1 = new Double(500.6);
        Double d2 = 900.50;

        Character ch1 = new Character('A');
        Character ch2 = 'z';

        Boolean bl1 = new Boolean(true);
        Boolean bl2 = false;


    }
}
