package Day26_ForLoop_Continue;

public class PrintChars {
    public static void main(String[] args) {

        String word = "Good night everyone!";
        System.out.println(word.length()); // 4
        //System.out.println(word.charAt(4) -1); // 4 ==>  String index out of range: 4
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));

        System.out.println("------Now lets do with loop-------");

        for ( int i = 0; i < word.length(); i++){
            System.out.print(i + " = ");
            System.out.println(word.charAt(i));

        }
        System.out.println("------Now lets do reverse-------");

        for (int j = word.length() -1 ; j >= 0; j --){
            System.out.print(j + " = ");
            System.out.println(word.charAt(j));

        }

    }
}
