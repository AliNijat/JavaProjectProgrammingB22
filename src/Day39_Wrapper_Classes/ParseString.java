package Day39_Wrapper_Classes;

public class ParseString {
    public static void main(String[] args) {

        String total = "1234";
        Double price = Double.parseDouble(total);

        String tax = "1.99";
        Double tax1 = Double.parseDouble(tax);

        double totalPrice = price + tax1;
        System.out.println(totalPrice);

        String sum = "1009";
        if (totalPrice > 100) {
            System.out.println("More then hundred");
        }
        if (Double.parseDouble(sum) > 100) {
            System.out.println("Keep up doing work");
        }

        String sentence = "I like to 100 % learn it";

        String sent[] = sentence.split(" ");
        int num = Integer.parseInt(sent[3]);
        System.out.println("Divide by + " +num/2);

    }
}
