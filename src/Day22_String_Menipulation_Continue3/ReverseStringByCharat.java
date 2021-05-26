package Day22_String_Menipulation_Continue3;

public class ReverseStringByCharat {
    public static void main(String[] args) {

        String word = "Tester";

        String indexOf = ""+word.charAt(word.length()-1);
        System.out.println(indexOf);

        // System.out.println(  indexOf-2 + indexOf-3 + indexOf-4 + indexOf-5);
        System.out.print(word.charAt(word.length()-1));
        System.out.print(word.charAt(word.length()-2));
        System.out.print(word.charAt(word.length()-3));
        System.out.print(word.charAt(word.length()-4));
        System.out.print(word.charAt(word.length()-5));
       // System.out.println(word.charAt(word.length()-6));


    }
}
